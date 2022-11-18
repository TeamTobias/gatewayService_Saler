package com.example.gatewayservice_saler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceSalerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceSalerApplication.class, args);
        System.out.println("GatewayServiceSalerApplication is running");
    }

}
