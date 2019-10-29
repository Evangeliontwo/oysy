package com.kgc.oysy.cloudtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoApplication {
//这是注册中心
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
