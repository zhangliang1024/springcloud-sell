package com.example.server.dao;

import com.example.server.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: colin
 * @Date: 2019/1/3 23:24
 * @Description:
 * @Version: V1.0
 */
public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {
}
