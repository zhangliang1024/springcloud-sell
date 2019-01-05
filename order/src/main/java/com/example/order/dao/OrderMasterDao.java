package com.example.order.dao;

import com.example.order.domain.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: colin
 * @Date: 2019/1/3 23:23
 * @Description:
 * @Version: V1.0
 */
public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {
}
