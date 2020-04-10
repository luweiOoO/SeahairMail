package com.luwei.seahairmail.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeahairmailOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeahairmailOrderApplication.class, args);
    }

}
