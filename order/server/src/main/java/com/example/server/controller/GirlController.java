package com.example.server.controller;

import com.example.server.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: colin
 * @Date: 2019/1/6 08:24
 * @Description:
 * @Version: V1.0
 */
@RestController
@RequestMapping("/girl")
public class GirlController {


    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/print")
    public String print(){
        return girlConfig.getName() + girlConfig.getAge() ;
    }
}
