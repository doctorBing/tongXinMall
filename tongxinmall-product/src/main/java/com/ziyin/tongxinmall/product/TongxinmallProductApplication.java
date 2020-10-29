package com.ziyin.tongxinmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.product.dao")
public class TongxinmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallProductApplication.class, args);
	}

}
