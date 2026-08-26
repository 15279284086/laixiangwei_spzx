package com.lxw.spzx.manager.service;

import com.lxw.spzx.model.dto.order.OrderStatisticsDto;
import com.lxw.spzx.model.vo.order.OrderStatisticsVo;

public interface OrderInfoService {
    OrderStatisticsVo getOrderStatisticsData(OrderStatisticsDto orderStatisticsDto);
}
