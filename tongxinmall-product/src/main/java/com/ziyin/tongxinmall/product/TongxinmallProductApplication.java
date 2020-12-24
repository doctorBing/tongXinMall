package com.ziyin.tongxinmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.product.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ziyin.tongxinmall.product.feign")
public class TongxinmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallProductApplication.class, args);
	}

}
