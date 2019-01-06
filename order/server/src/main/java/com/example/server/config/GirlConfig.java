package com.example.server.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author: colin
 * @Date: 2019/1/6 08:22
 * @Description:
 * @Version: V1.0
 */
@Data
@ConfigurationProperties("girl")
@Component
@RefreshScope
public class GirlConfig {

    private String name; 
    private Integer age;
}
