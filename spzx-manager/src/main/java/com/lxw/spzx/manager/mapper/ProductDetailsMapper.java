package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.entity.product.ProductDetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDetailsMapper {
    void save(ProductDetails productDetails);
    void updateById(ProductDetails productDetails);
    ProductDetails  selectByProductId(Long id);
    void deleteByProductId(Long id);
}
