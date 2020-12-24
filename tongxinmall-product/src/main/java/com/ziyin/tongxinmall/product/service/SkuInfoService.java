package com.ziyin.tongxinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:02
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageByCondition(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);
}

