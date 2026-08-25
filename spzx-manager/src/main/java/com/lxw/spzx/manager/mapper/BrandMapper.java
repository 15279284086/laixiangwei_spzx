package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.entity.product.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    public abstract List<Brand> findByPage();

}
