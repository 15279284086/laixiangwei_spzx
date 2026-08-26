package com.lxw.spzx.model.dto.system.product;

import com.lxw.spzx.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class ProductDto extends BaseEntity {

    private Long brandId;
    private Long category1Id;
    private Long category2Id;
    private Long category3Id;

}
