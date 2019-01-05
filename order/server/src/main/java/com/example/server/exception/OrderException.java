package com.example.server.exception;

import com.example.server.enums.ResultEnum;

/**
 * @Author: colin
 * @Date: 2019/1/5 11:21
 * @Description:
 * @Version: V1.0
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
