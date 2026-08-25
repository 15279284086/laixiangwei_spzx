package com.lxw.spzx.manager.service;

import com.lxw.spzx.model.vo.common.system.ValidateCodeVo;

public interface ValidateCodeService {
    // 获取验证码图片
    public abstract ValidateCodeVo generateValidateCode();
}
