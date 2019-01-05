package com.example.order.common;

import lombok.Data;

/**
 * @Author: colin
 * @Date: 2019/1/5 17:57
 * @Description:
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
