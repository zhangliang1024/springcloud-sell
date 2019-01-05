package com.example.server.controller;

import com.example.product.client.ProductClient;
import com.example.product.common.DecreaseStockInput;
import com.example.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/5 14:43
 * @Description:
 * @Version: V1.0
 */
@RestController
@Slf4j
public class ClientController {


    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    // -----------    --fegin--  ------------------
    @Autowired
    private ProductClient productClient;


    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        //1. RestTemplate 第一种方式 (直接使用RestTemplate url写死)
        //RestTemplate restTemplate = new RestTemplate();
        //String response = restTemplate.getForObject("http://localhost:8080/msg",String.class);
        //log.info("response={}",response);

        //2.第二种方式  (利用 loadBalancerClient 通过应用名获取url ，然后在使用RestTemplate)
        //ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        //String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getHost()+"/msg");
        //RestTemplate restTemplate = new RestTemplate();
        //String response = restTemplate.getForObject(url,String.class);
        //log.info("response={}",response);

        //3.第三种方式 (利用@LoadBalanced, 可以在restTemplate里面是使用 服务的名称)
        //String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);
        //log.info("response={}",response);

        //4.使用 feign 来实现服务之间的调用
        String response = productClient.getProductMsg();
        log.info("response={}",response);
        return response;
    }


    @GetMapping("/getProductList")
    public String getProductList(){
        List<ProductInfoOutput> productInfoList = productClient.lisgForOrder(Arrays.asList("164103465734242707"));
        log.info("respose=>{}",productInfoList);
        return "ok";
    }

    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("164103465734242707",3)));

        return "ok";
    }

}
