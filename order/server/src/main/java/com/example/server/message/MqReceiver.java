package com.example.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: colin
 * @Date: 2019/1/6 10:54
 * @Description:  接收mq消息
 * @Version: V1.0
 */
@Component
@Slf4j
public class MqReceiver {

    //1.第一种方式：需要手动去15672创建 队列
    // @RabbitListener(queues = "myQueue")

    //2.第二种方式：自动创建队列
    //@RabbitListener(queuesToDeclare = @Queue("myQueue"))

    //3.第三种方式：队列和交换器绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message){
        log.info("MqReceiver: {}",message);
    }

    // ------------ 模拟 消息分组 订单   水果 数码 -------------


    /**
     * 数码 供应商 接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            key = "computer",
            exchange = @Exchange("myOrder")
    ))
    public void computeProcess(String message){
        log.info("computer MqReceiver: {}",message);
    }

    /**
     * 水果 供应商 接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),
            key = "fruit",
            exchange = @Exchange("myOrder")
    ))
    public void fruitProcess(String message){
        log.info("fruit MqReceiver: {}",message);
    }

}

