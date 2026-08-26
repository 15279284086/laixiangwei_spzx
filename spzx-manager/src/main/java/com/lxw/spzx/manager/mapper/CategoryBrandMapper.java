package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.dto.system.product.CategoryBrandDto;
import com.lxw.spzx.model.entity.product.CategoryBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryBrandMapper {
    public abstract List<CategoryBrand> findByPage(CategoryBrandDto CategoryBrandDto);
    void save(CategoryBrand categoryBrand);
    void updateById(CategoryBrand categoryBrand);
    void deleteById(Long id);
}