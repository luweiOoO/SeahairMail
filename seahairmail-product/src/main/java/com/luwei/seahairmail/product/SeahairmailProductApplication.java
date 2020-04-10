package com.luwei.seahairmail.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeahairmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeahairmailProductApplication.class, args);
    }

}
