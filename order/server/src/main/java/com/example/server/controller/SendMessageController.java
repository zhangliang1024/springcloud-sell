package com.example.server.controller;

import com.example.server.dto.OrderDTO;
import com.example.server.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: colin
 * @Date: 2019/1/6 11:32
 * @Description:
 * @Version: V1.0
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/sendMessage")
    public void process(){
        String message = "now: " + new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());
    }

    /**
     * 发送 实体对象
     */
    @GetMapping("/sendMessageObj")
    public void processObj(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("1232532");
        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }


}
