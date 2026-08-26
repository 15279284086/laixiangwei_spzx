package com.lxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.lxw.spzx.model.entity.product.Brand;

import java.util.List;

public interface BrandService {
    PageInfo<Brand> findByPage(Integer page, Integer limit);
    List<Brand> findAll();
}
