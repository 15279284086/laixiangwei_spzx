package com.lxw.spzx.manager.service;


import com.github.pagehelper.PageInfo;
import com.lxw.spzx.model.dto.system.SysRoleDto;
import com.lxw.spzx.model.entity.system.SysRole;

import java.util.Map;

// 业务接口
public interface SysRoleService {
    public abstract PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer pageNum, Integer pageSize);
    public void saveSysRole(SysRole sysRole);
    void updateSysRole(SysRole sysRole);
    void deleteById(Long roleId);

    //Map<String, Object> findAllRoles();

    Map<String, Object> findAllRoles(Long userId);
}
