package com.lxw.spzx.model.vo.common.system;

import lombok.Data;

import java.util.List;

@Data
public class SysMenuVo {

    private String title;
    private String name;
    private List<SysMenuVo> children;

}