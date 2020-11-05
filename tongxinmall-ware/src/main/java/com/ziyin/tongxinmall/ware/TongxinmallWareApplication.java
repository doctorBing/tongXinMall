package com.ziyin.tongxinmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.ware.dao")
@EnableDiscoveryClient
public class TongxinmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallWareApplication.class, args);
	}

}
