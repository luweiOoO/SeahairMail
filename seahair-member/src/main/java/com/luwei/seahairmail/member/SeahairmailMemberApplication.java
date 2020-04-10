package com.luwei.seahairmail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.luwei.seahairmail.member.feign")
public class SeahairmailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeahairmailMemberApplication.class, args);
    }

}
