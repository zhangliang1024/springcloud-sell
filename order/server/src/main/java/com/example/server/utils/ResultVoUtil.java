package com.example.server.utils;

import com.example.server.Vo.ResultVo;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:53
 * @Description:
 * @Version: V1.0
 */
public class ResultVoUtil {


    public static ResultVo success(Object obj){
        ResultVo vo = new ResultVo();
        vo.setCode(200);
        vo.setMsg("success");
        vo.setData(obj);
        return vo;
    }


}
