package com.wen.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient // 服务消费者 与 服务提供者 使用相同的注解
@EnableFeignClients // 启动 feign 客户端
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

    @Bean
    @LoadBalanced   // 请求客户端时拥有负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
