package com.ziyin.tongxinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:03
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveProductAttr(List<ProductAttrValueEntity> collect);
}

