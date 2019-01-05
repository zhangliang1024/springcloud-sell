package com.example.order.enums;

import lombok.Getter;

/**
 * @Author: colin
 * @Date: 2019/1/3 23:39
 * @Description:
 * @Version: V1.0
 */
@Getter
public enum PayStatusEnum {


    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
