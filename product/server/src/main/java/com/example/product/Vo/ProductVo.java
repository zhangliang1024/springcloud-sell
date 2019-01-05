package com.example.product.Vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: colin
 * @Date: 2019/1/3 22:30
 * @Description:
 * @Version: V1.0
 */
@Data
public class ProductVo {

    /**
     * @JsonProperty 用来封装返回数据的格式：name
     *               categoryName 这里会更友好
     */
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVo> productInfoVoList;
}
