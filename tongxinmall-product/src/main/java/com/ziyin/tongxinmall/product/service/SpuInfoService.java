package com.ziyin.tongxinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.product.entity.SpuInfoEntity;
import com.ziyin.tongxinmall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:03
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageByCondition(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);
}

