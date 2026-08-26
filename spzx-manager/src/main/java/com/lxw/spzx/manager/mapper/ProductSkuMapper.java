package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSkuMapper {
    void save(ProductSku productSku);
    List<ProductSku> selectByProductId(Long id);
    void deleteById(Long id);
    void updateById(ProductSku productSku);
    void deleteByProductId(Long id);
}
