package com.lxw.spzx.common.log.service;

import com.lxw.spzx.model.entity.system.SysOperLog;

public interface AsyncOperLogService {            // 保存日志数据
    public abstract void saveSysOperLog(SysOperLog sysOperLog) ;
}
