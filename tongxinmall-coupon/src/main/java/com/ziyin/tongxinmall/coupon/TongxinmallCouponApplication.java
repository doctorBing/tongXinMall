package com.ziyin.tongxinmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.coupon.dao")
@EnableDiscoveryClient
public class TongxinmallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallCouponApplication.class, args);
	}

}
