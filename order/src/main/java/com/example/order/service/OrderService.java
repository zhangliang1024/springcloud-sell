package com.example.order.service;

import com.example.order.dto.OrderDTO;

/**
 * @Author: colin
 * @Date: 2019/1/5 11:37
 * @Description:
 * @Version: V1.0
 */
public interface OrderService {


    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

}
