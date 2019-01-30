package com.anjubao.ceshiparentserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
/*@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@EnableCircuitBreaker*/
@MapperScan("com.anjubao.ceshiparentserver.mapper")
public class CeshiParentClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CeshiParentClientApplication.class, args);
    }

}
