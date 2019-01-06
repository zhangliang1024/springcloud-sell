package com.example.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
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


}
