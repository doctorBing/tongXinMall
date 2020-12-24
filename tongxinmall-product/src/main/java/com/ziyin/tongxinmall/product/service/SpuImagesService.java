package com.ziyin.tongxinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.product.entity.SpuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * spu图片
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:03
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
    void saveImages(Long id, List<String> images);
}

