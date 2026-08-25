package com.lxw.spzx.controller;

import com.lxw.spzx.manager.service.SysMenuService;
import com.lxw.spzx.manager.service.SysUserService;
import com.lxw.spzx.manager.service.ValidateCodeService;
import com.lxw.spzx.model.dto.system.LoginDto;
import com.lxw.spzx.model.entity.system.SysUser;
import com.lxw.spzx.model.vo.common.Result;
import com.lxw.spzx.model.vo.common.ResultCodeEnum;
import com.lxw.spzx.model.vo.common.system.LoginVo;
import com.lxw.spzx.model.vo.common.system.SysMenuVo;
import com.lxw.spzx.model.vo.common.system.ValidateCodeVo;
import com.lxw.spzx.utils.AuthContextUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "用户接口")
@RestController
@RequestMapping(value = "/admin/system/index")
public class IndexController {
    @Autowired
    private SysUserService sysUserService ;

    @Autowired
    private ValidateCodeService validateCodeService ;

    @Autowired
    private SysMenuService sysMenuService ;

    @Operation(summary = "登录接口")
    @PostMapping(value = "/login")
    public Result<LoginVo> login(@RequestBody LoginDto loginDto) {
        LoginVo loginVo = sysUserService.login(loginDto) ;
        return Result.build(loginVo , ResultCodeEnum.SUCCESS) ;
    }
    @Operation(summary = "获取验证码接口")
    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo , ResultCodeEnum.SUCCESS) ;
    }
    @Operation(summary = "获取用户信息接口")
    @GetMapping(value = "/getUserInfo")
    public Result<SysUser> getUserInfo(@RequestHeader(name = "token") String token) {
        //SysUser sysUser = sysUserService.getUserInfo(token) ;
         return Result.build(AuthContextUtil.get()  , ResultCodeEnum.SUCCESS) ;
    }
    @GetMapping(value = "/logout")
    public Result logout(@RequestHeader(value = "token") String token) {
        sysUserService.logout(token) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @GetMapping("/menus")
    public Result menus() {
        List<SysMenuVo> sysMenuVoList =  sysMenuService.findUserMenuList() ;
        return Result.build(sysMenuVoList , ResultCodeEnum.SUCCESS) ;
    }
}