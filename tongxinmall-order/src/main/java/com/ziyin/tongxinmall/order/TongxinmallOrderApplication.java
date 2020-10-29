package com.ziyin.tongxinmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.order.dao")
public class TongxinmallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallOrderApplication.class, args);
	}

}
