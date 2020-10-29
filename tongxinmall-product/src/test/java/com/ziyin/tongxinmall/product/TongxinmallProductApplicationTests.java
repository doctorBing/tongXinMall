package com.ziyin.tongxinmall.product;

import com.ziyin.tongxinmall.product.entity.BrandEntity;
import com.ziyin.tongxinmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TongxinmallProductApplicationTests {

	@Resource
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setDescript("hahah");
		brandEntity.setName("rongyao");
		brandService.save(brandEntity);
	}

}
