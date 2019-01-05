package com.example.order.client;

import com.example.order.common.DecreaseStockInput;
import com.example.order.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/5 15:45
 * @Description:
 * @Version: V1.0
 */
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String getProductMsg();

    @PostMapping("/product/listForOrder")
    public List<ProductInfoOutput> lisgForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);

}
