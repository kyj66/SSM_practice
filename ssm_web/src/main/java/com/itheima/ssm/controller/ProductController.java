package com.itheima.ssm.controller;

import com.itheima.ssm.service.ProductService;
import com.itheima.ssm.domain.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll.do")
    public List<Product> findAll() throws Exception {
        List<Product> productList = productService.findAll();
        return productList;
    }

}
