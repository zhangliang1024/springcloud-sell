package com.example.server.enums;

import lombok.Getter;

/**
 * @Author: colin
 * @Date: 2019/1/3 23:36
 * @Description:
 * @Version: V1.0
 */
@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISH(1,"完结"),
    CANCEL(2,"取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
