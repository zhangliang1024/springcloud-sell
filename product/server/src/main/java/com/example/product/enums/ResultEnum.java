package com.example.product.enums;

import lombok.Getter;

/**
 * @Author: colin
 * @Date: 2019/1/5 17:45
 * @Description:
 * @Version: V1.0
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"商品库存有误"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
