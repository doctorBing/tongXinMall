package com.ziyin.tongxinmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-29 21:21:16
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

