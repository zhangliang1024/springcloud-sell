package com.example.product.enums;

import lombok.Getter;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:11
 * @Description:
 * @Version: V1.0
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"上架"),
    DOWN(1,"下架"),
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
