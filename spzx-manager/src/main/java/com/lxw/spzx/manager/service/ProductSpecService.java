package com.lxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.lxw.spzx.model.entity.product.ProductSpec;


public interface ProductSpecService {
    PageInfo<ProductSpec> findByPage(Integer page, Integer limit);
    void save(ProductSpec productSpec);
    void updateById(ProductSpec productSpec);
    void deleteById(Long id);
}
