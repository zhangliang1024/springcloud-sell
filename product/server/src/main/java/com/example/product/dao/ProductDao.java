package com.example.product.dao;

import com.example.product.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/3 01:05
 * @Description:
 * @Version: V1.0
 */
public interface ProductDao extends JpaRepository<ProductInfo,String> {


    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
