package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.dto.system.product.ProductDto;
import com.lxw.spzx.model.entity.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findByPage(ProductDto productDto);
    void save(Product product);
    Product selectById(Long id);
    void updateById(Product product);
    void deleteById(Long id);
}
