package com.lxw.spzx.manager.service;

import com.lxw.spzx.model.dto.system.AssginMenuDto;

import java.util.Map;

public interface SysRoleMenuService {
    Map<String, Object> findSysRoleMenuByRoleId(Long roleId);
    void doAssign(AssginMenuDto assginMenuDto);
}
