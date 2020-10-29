package com.ziyin.tongxinmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.ware.dao")
public class TongxinmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallWareApplication.class, args);
	}

}
