package com.lxw.spzx.model.entity.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    private Long id;
    @JsonFormat
    private Date createTime;
    @JsonFormat
    private Date updateTime;
    private Integer isDeleted;

}
