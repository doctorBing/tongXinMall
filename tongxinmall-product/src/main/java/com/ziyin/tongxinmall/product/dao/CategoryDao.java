package com.ziyin.tongxinmall.product.dao;

import com.ziyin.tongxinmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ziyin
 * @email ****
 * @date 2020-10-26 21:56:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
