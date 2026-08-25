package com.lxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.lxw.spzx.model.dto.system.AssginRoleDto;
import com.lxw.spzx.model.dto.system.LoginDto;
import com.lxw.spzx.model.dto.system.SysUserDto;
import com.lxw.spzx.model.entity.system.SysUser;
import com.lxw.spzx.model.vo.common.system.LoginVo;
import org.apache.ibatis.annotations.Mapper;


public interface SysUserService {
    /**
     * 根据用户名查询用户数据
     * @return
     */
    public  LoginVo login(LoginDto loginDto) ;
    public SysUser getUserInfo(String token);

    void logout(String token);
    PageInfo<SysUser> findByPage(SysUserDto sysUserDto, Integer pageNum, Integer pageSize);

    void saveSysUser(SysUser sysUser);

    void updateSysUser(SysUser sysUser);

    void deleteById(Long userId);

    void doAssign(AssginRoleDto assginRoleDto);
}
