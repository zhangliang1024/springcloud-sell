package com.example.product.service.impl;

import com.example.product.ProductApplicationTests;
import com.example.product.common.DecreaseStockInput;
import com.example.product.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput();
        decreaseStockInput.setProductId("157875196366160022");
        decreaseStockInput.setProductQuantity(2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}