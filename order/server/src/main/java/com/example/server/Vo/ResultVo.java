package com.example.server.Vo;

import lombok.Data;

/**
 * @Author: colin
 * @Date: 2019/1/5 11:16
 * @Description:
 * @Version: V1.0
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T data;
}
