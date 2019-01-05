package com.example.product.common;

import lombok.Data;

/**
 * @Author: colin
 * @Date: 2019/1/5 17:41
 * @Description:  购物车
 * @Version: V1.0
 */
@Data
public class DecreaseStockInput {
    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
