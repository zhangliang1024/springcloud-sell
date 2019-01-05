package com.example.product.service;

import com.example.product.domain.ProductCategory;

import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:24
 * @Description:
 * @Version: V1.0
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
