package com.lxw.spzx.exception;

import com.lxw.spzx.model.vo.common.ResultCodeEnum;

public class SpzxException  extends RuntimeException {
    private Integer code ;          // 错误状态码
    private String message ;        // 错误消息

    private ResultCodeEnum resultCodeEnum ;     // 封装错误状态码和错误消息

    public SpzxException(ResultCodeEnum resultCodeEnum) {
        this.resultCodeEnum = resultCodeEnum ;
        this.code = resultCodeEnum.getCode() ;
        this.message = resultCodeEnum.getMessage();
    }

    public SpzxException(Integer code , String message) {
        this.code = code ;
        this.message = message ;
    }

}
