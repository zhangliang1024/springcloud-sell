package com.example.order.utils;

import java.util.Random;

/**
 * @Author: colin
 * @Date: 2019/1/5 11:46
 * @Description:  生成订单uitl
 * @Version: V1.0
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}
