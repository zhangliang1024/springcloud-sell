package com.example.server.messsage;

import com.example.server.ServerApplicationTests;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author: colin
 * @Date: 2019/1/6 10:56
 * @Description:
 * @Version: V1.0
 */
public class MqSenderTest extends ServerApplicationTests {


    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","now："+new Date());
    }

    @Test
    public void sendOrder(){
        amqpTemplate.convertAndSend("myOrder","computer","now："+new Date());
    }
}
