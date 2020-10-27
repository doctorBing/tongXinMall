package com.ziyin.tongxinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

