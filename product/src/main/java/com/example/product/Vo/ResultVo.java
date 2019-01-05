package com.example.product.Vo;

import lombok.Data;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:28
 * @Description:
 * @Version: V1.0
 */
@Data
public class ResultVo<T> {

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;
}
