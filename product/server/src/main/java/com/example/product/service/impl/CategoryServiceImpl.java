package com.example.product.service.impl;

import com.example.product.dao.ProductCategoryDao;
import com.example.product.domain.ProductCategory;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:25
 * @Description:
 * @Version: V1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }
}
