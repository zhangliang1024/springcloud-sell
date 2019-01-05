package com.example.product.service;

import com.example.product.common.DecreaseStockInput;
import com.example.product.common.ProductInfoOutput;
import com.example.product.domain.ProductInfo;

import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:09
 * @Description:
 * @Version: V1.0
 */
public interface ProductService {

    List<ProductInfo> findUpAll();

    List<ProductInfoOutput> findList(List<String> productIdList);

    void decreaseStock(List<DecreaseStockInput> DecreaseStockInputList);
}
