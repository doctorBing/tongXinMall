package com.ziyin.tongxinmall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ziyin.tongxinmall.product.entity.ProductAttrValueEntity;
import com.ziyin.tongxinmall.product.service.ProductAttrValueService;
import com.ziyin.tongxinmall.product.vo.AttrGroupRelationVo;
import com.ziyin.tongxinmall.product.vo.AttrRespVo;
import com.ziyin.tongxinmall.product.vo.AttrVo;
import com.ziyin.tongxinmall.product.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ziyin.tongxinmall.product.entity.AttrEntity;
import com.ziyin.tongxinmall.product.service.AttrService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.common.utils.R;

import javax.annotation.Resource;


/**
 * 商品属性
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 22:50:32
 */
@RestController
@RequestMapping("product/attr")
public class AttrController<ProductAttrValueService> {
    @Autowired
    private AttrService attrService;

    @Resource
    ProductAttrValueService productAttrValueService;

    ///product/attr/info/{attrId}

    // /product/attr/base/listforspu/{spuId}
    // TODO
    /*@GetMapping("/base/listforspu/{spuId}")
    public R baseAttrlistforspu(@PathVariable("spuId") Long spuId){

        List<ProductAttrValueEntity> entities = productAttrValueService.baseAttrlistforspu(spuId);

        return R.ok().put("data",entities);
    }*/

    //product/attr/sale/list/0?
    ///product/attr/base/list/{catelogId}
    @GetMapping("/{attrType}/list/{catelogId}")
    public R baseAttrList(@RequestParam Map<String, Object> params,
                          @PathVariable("catelogId") Long catelogId,
                          @PathVariable("attrType")String type){

        PageUtils page = attrService.queryBaseAttrPage(params,catelogId,type);
        return R.ok().put("page", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:attr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    //@RequiresPermissions("product:attr:info")
    public R info(@PathVariable("attrId") Long attrId){
		//AttrEntity attr = attrService.getById(attrId);
        AttrRespVo respVo = attrService.getAttrInfo(attrId);

        return R.ok().put("attr", respVo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:attr:save")
    public R save(@RequestBody AttrVo attr){
		attrService.saveAttr(attr);

        return R.ok();
    }

    ///product/attrgroup/attr/relation/delete


    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:attr:update")
    public R update(@RequestBody AttrVo attr){
		attrService.updateAttr(attr);

        return R.ok();
    }

    // TODO
    ///product/attr/update/{spuId}
    /*@PostMapping("/update/{spuId}")
    public R updateSpuAttr(@PathVariable("spuId") Long spuId,
                           @RequestBody List<ProductAttrValueEntity> entities){

        productAttrValueService.updateSpuAttr(spuId,entities);

        return R.ok();
    }*/

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:attr:delete")
    public R delete(@RequestBody Long[] attrIds){
		attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
