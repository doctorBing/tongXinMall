package com.ziyin.tongxinmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ziyin.tongxinmall.member.dao")
public class TongxinmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(TongxinmallMemberApplication.class, args);
	}

}
