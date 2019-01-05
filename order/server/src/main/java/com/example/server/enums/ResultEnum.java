package com.example.server.enums;

import lombok.Getter;

/**
 * @Author: colin
 * @Date: 2019/1/5 11:22
 * @Description:
 * @Version: V1.0
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数错误"),
    CART_EMPTY(2,"购物车为空"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
