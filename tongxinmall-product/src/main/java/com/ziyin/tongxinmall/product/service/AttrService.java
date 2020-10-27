package com.ziyin.tongxinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

