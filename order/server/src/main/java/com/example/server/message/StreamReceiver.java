package com.example.server.message;

import com.example.server.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @Author: colin
 * @Date: 2019/1/6 11:29
 * @Description:
 * @Version: V1.0
 */
@Component
@Slf4j
@EnableBinding(StreamClient.class) // 之前写的stream 接口
public class StreamReceiver {


    @StreamListener(StreamClient.INPUT)
    public void process(Object message){
        log.info("StreamReceiver: {}",message);
    }

    /**
     * 接收 对象类型
     * @param message
     */
    @StreamListener(StreamClient.INPUT)
    public void processObj(OrderDTO message){
        log.info("Obj StreamReceiver: {}",message);
    }


    /**
     * 接收 对象类型, 并返回消息
     * @param message
     */
    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String processObjTo(OrderDTO message){
        log.info("Obj StreamReceiver: {}",message);
        return "received message";
    }

    /**
     * 接收 上面 SendTo的消息
     * @param message
     */
    @StreamListener(StreamClient.INPUT2)
    public void process2(String message){
        log.info("StreamReceiver2: {}",message);
    }

}
