package com.luwei.seahairmail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 1、开启服务注册发现
 * （配置nacos的）
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SeahairmailGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeahairmailGatewayApplication.class, args);
    }

}
