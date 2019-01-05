package com.example.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:18
 * @Description:
 * @Version: V1.0
 */
@Data
@Entity
public class ProductCategory {

    @Id // 主键
    @GeneratedValue  // 自增长
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
