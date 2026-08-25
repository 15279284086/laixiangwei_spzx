package com.lxw.spzx.manager.mapper;

import com.lxw.spzx.model.dto.system.SysUserDto;
import com.lxw.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {
    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
     SysUser selectByUserName(String userName) ;

     List<SysUser> findByPage(SysUserDto sysUserDto);

    public abstract SysUser findByUserName(String name);
    public abstract void saveSysUser(SysUser sysUser);

    void updateSysUser(SysUser sysUser);

    void deleteById(Long userId);

}
