package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.entity.system.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysMenuMapper {
    public abstract List<SysMenu> selectAll();
    void insert(SysMenu sysMenu);
    void updateById(SysMenu sysMenu);
    public abstract int countByParentId(Long id);
    public abstract void deleteById(Long id);
    List<SysMenu> selectListByUserId(Long userId);
}
