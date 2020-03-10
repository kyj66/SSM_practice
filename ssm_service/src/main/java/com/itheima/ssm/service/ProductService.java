package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface ProductService {

    //查询所有的产品信息
    List<Product> findAll() throws Exception;
}
