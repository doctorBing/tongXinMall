package com.ziyin.tongxinmall.order.dao;

import com.ziyin.tongxinmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ziyin
 * @email ****
 * @date 2020-10-29 21:21:16
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
