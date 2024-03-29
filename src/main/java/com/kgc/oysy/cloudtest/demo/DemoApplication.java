package com.kgc.oysy.cloudtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

//这是注册中心
public class DemoApplication {
    //asdf

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
