package com.ziyin.tongxinmall.order.dao;

import com.ziyin.tongxinmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ziyin
 * @email ****
 * @date 2020-10-29 21:21:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
