package com.ziyin.tongxinmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TongXinMallThirdPartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TongXinMallThirdPartyApplication.class, args);
    }
}
