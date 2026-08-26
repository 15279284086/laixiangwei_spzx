package com.lxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.lxw.spzx.model.dto.system.product.ProductDto;
import com.lxw.spzx.model.entity.product.Product;

import java.util.List;

public interface ProductService {
    PageInfo<Product>  findByPage(Integer page, Integer limit, ProductDto productDto);
    void save(Product  product);
    void updateById(Product product);
    void deleteById(Long id);
    Product getById(Long id);
    void updateAuditStatus(Long id, Integer auditStatus);
    void updateStatus(Long id, Integer status);
}
