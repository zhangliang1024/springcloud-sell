package com.example.server.controller;

import com.example.server.Vo.ResultVo;
import com.example.server.converter.OrderForm2OrderDTOConverter;
import com.example.server.dto.OrderDTO;
import com.example.server.enums.ResultEnum;
import com.example.server.exception.OrderException;
import com.example.server.from.OrderForm;
import com.example.server.service.OrderService;
import com.example.server.utils.ResultVoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: colin
 * @Date: 2019/1/4 14:19
 * @Description:
 * @Version: V1.0
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {


    @Autowired
    private OrderService orderService;

    /**
     * 1.校验参数
     * 2.查询商品信息(调用商品服务)
     * 3.计算总价
     * 4.扣库存(调用商品服务)
     * 5.订单入库
     */
    @PostMapping("/create")
    public ResultVo<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        //1.参数校验
        if(bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确, orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                                     bindingResult.getFieldError().getDefaultMessage());
        }
        //2.对象数据类型转换
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }
        OrderDTO result = orderService.create(orderDTO);
        Map<String,String> map = new HashMap<>();
        map.put("orderId",result.getOrderId());
        return ResultVoUtil.success(map);
    }


}
