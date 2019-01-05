package com.example.order;

import lombok.Data;

/**
 * @Author: colin
 * @Date: 2019/1/5 18:03
 * @Description:
 * @Version: V1.0
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
