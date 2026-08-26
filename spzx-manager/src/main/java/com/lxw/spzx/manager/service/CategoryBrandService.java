package com.lxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.lxw.spzx.model.dto.system.product.CategoryBrandDto;
import com.lxw.spzx.model.entity.product.Brand;
import com.lxw.spzx.model.entity.product.CategoryBrand;

import java.util.List;

public interface CategoryBrandService {
    PageInfo<CategoryBrand> findByPage(Integer page, Integer limit, CategoryBrandDto CategoryBrandDto);
    void save(CategoryBrand categoryBrand);
    void updateById (CategoryBrand categoryBrand);
    void deleteById(Long id);
    List<Brand> findBrandByCategoryId(Long id);
}
