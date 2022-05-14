package com.csu.mall;

import com.csu.mall.es.ProductESRepository;
import com.csu.mall.pojo.Product;
import com.csu.mall.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    @Autowired
    ProductServiceImpl productService;

    @Autowired
    ProductESRepository productESRepository;

    @Test
    public void add() {
        Product product = new Product();
        product.setName("战神笔记本");
        productService.addProduct(product);
    }

    @Test
    public void get() {
        System.out.println(productESRepository.findById(1));

//        Product product = productService.getById(1);
//        System.out.println(product);

    }
}