package com.example.product.controller;

import com.example.product.Vo.ProductInfoVo;
import com.example.product.Vo.ProductVo;
import com.example.product.Vo.ResultVo;
import com.example.product.common.DecreaseStockInput;
import com.example.product.common.ProductInfoOutput;
import com.example.product.domain.ProductCategory;
import com.example.product.domain.ProductInfo;
import com.example.product.service.CategoryService;
import com.example.product.service.ProductService;
import com.example.product.utils.ResultVoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: colin
 * @Date: 2019/1/3 00:47
 * @Description: 商品
 * @Version: V1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 1.查询所有的在架的商品
     * 2.获取类目 type列表
     * 3.查询类目
     * 4.构造返回数据
     */
    @GetMapping("/list")
    public ResultVo<ProductVo> list() {
        //1.查询所有的在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2.获取类目 type列表
        List<Integer> categoryTypeList = productInfoList.stream().
                                        map(ProductInfo::getCategoryType).
                                        collect(Collectors.toList());

        //3. 查询类目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //4. 构造返回数据
        List<ProductVo> productVoList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo,productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }
            }

            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }
        return ResultVoUtil.success(productVoList);
    }


    /**
     * 获取商品的列表 (给订单服务用的)
     * @param productIdList
     * @return
     */
    @PostMapping("/listForOrder")
    public List<ProductInfoOutput> lisgForOrder(@RequestBody List<String> productIdList){
        return productService.findList(productIdList);
    }

    /**
     * 商品服务扣库存操作 (给订单服务调用)
     */
    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList){
        productService.decreaseStock(decreaseStockInputList);
    }
}
