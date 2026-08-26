package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.entity.product.ProductSpec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSpecMapper {
    public abstract List<ProductSpec> findByPage();
    void save(ProductSpec productSpec);
    void updateById(ProductSpec productSpec);
    void deleteById(Long id);
    List<ProductSpec> findAll();
}
