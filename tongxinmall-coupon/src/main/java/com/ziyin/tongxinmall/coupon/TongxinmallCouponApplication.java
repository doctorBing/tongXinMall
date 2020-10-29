package com.ziyin.tongxinmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.coupon.dao")
public class TongxinmallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallCouponApplication.class, args);
	}

}
