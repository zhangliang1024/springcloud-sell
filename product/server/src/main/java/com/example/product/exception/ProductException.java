package com.example.product.exception;

import com.example.product.enums.ResultEnum;

/**
 * @Author: colin
 * @Date: 2019/1/5 17:44
 * @Description:
 * @Version: V1.0
 */
public class ProductException extends RuntimeException {

    private Integer code;

    ProductException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
