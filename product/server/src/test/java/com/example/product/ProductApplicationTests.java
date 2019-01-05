package com.example.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ComponentScan(basePackages = "com.example.demo.*.*")
//@EnableJpaRepositories(basePackages = "com.example.*.dao")
//@EntityScan("com.example.*.*")
public class ProductApplicationTests {

    @Test
    public void contextLoads() {
    }

}

