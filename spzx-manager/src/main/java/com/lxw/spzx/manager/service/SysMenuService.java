package com.lxw.spzx.manager.service;

import com.lxw.spzx.model.entity.system.SysMenu;
import com.lxw.spzx.model.vo.common.system.SysMenuVo;

import java.util.List;

public interface SysMenuService {
    List<SysMenu> findNodes();
    void save(SysMenu sysMenu);
    void updateById(SysMenu sysMenu);
    void removeById(Long id);
    List<SysMenuVo> findUserMenuList();
}
