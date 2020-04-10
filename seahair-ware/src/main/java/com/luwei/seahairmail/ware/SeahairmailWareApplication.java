package com.luwei.seahairmail.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeahairmailWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeahairmailWareApplication.class, args);
    }

}
