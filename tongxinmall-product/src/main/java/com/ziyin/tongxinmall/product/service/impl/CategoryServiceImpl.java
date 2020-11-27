package com.ziyin.tongxinmall.product.service.impl;

import org.apache.logging.log4j.util.PropertySource;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.common.utils.Query;

import com.ziyin.tongxinmall.product.dao.CategoryDao;
import com.ziyin.tongxinmall.product.entity.CategoryEntity;
import com.ziyin.tongxinmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // 封装成树结构
        List<CategoryEntity> levelMenu = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map(menu -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))
        ).collect(Collectors.toList());

        return levelMenu;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        // TODO 检查当前菜单是否被别的地方所引用
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity parent, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == parent.getCatId()
        ).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort()))
        ).collect(Collectors.toList());

        return children;
    }


}