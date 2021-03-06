package com.luwei.seahairmail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SeahairmailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeahairmailCouponApplication.class, args);
    }

}
