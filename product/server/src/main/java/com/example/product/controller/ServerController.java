package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.StreamSupport;

/**
 * @Author: colin
 * @Date: 2019/1/5 14:41
 * @Description:
 * @Version: V1.0
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product msg";
    }
}
