package com.example.server.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: colin
 * @Date: 2019/1/6 11:26
 * @Description:
 * @Version: V1.0
 */
public interface StreamClient {

    String INPUT = "input";
    String INPUT2 = "input2";

    @Input(StreamClient.INPUT)
    SubscribableChannel input() ;

    @Output(StreamClient.INPUT)
    MessageChannel output();

    @Input(StreamClient.INPUT2)
    SubscribableChannel input2() ;

    @Output(StreamClient.INPUT2)
    MessageChannel output2();

}
