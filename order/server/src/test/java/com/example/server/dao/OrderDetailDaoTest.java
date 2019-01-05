package com.example.server.dao;

import com.example.server.ServerApplicationTests;
import com.example.server.dao.OrderDetailDao;
import com.example.server.domain.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderDetailDaoTest extends ServerApplicationTests {


    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void testSave(){
        OrderDetail detail = new OrderDetail();
        detail.setDetailId("11345");
        detail.setOrderId("354654q");
        detail.setProductIcon("http://xdfadf.com");
        detail.setProductId("157875196366160022");
        detail.setProductName("皮蛋粥");
        detail.setProductPrice(new BigDecimal(0.01));
        detail.setProductQuantity(2);
        OrderDetail result = orderDetailDao.save(detail);
        Assert.assertTrue(result != null);

    }
}