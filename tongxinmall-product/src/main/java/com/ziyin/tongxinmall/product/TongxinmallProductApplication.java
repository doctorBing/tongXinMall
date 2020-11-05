package com.ziyin.tongxinmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.product.dao")
@EnableDiscoveryClient
public class TongxinmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallProductApplication.class, args);
	}

}
