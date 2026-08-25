package com.lxw.spzx.manager.service.impl;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.lxw.spzx.manager.service.ValidateCodeService;
import com.lxw.spzx.model.vo.common.system.ValidateCodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {

    @Autowired
    private RedisTemplate<String , String> redisTemplate ;
    @Override
    public ValidateCodeVo generateValidateCode() {
        //使用hutool工具包中的工具类生成图片验证码
        //参数宽 高 验证码位数 干扰线数量
        CircleCaptcha circleCaptch = CaptchaUtil.createCircleCaptcha(150,48,4,20);
        String codeValue = circleCaptch.getCode();
        String imageBase64 = circleCaptch.getImageBase64();

        //生成uuid作为图片验证码的key
        String codeky = UUID.randomUUID().toString().replace("-","");

        //将验证码存储到reids中
        redisTemplate.opsForValue().set("user:login:validatecode:"+ codeky,codeValue,5, TimeUnit.MINUTES);

        //构建响应结果
        ValidateCodeVo validateCodeVo = new ValidateCodeVo();
        validateCodeVo.setCodeKey(codeky);
        validateCodeVo.setCodeValue("data:image/pmg;base64," + imageBase64);
        return validateCodeVo;
    }
}
