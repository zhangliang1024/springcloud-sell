package com.example.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: colin
 * @Date: 2019/1/3 00:59
 * @Description:
 * @Version: V1.0
 */
@Data
@Entity
@Table(name = "product_info")
public class ProductInfo {

    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus; // 商品状态
    private Integer categoryType;  // 类目id
    private Date createTime;
    private Date updateTime;

}
