package com.bcmall.kakaologinrebuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class KakaoLoginRebuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(KakaoLoginRebuildApplication.class, args);
    }

}
