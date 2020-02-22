package com.wen.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者项目
 */
@EnableEurekaClient  // 服务消费者 与 服务提供者 使用一样的注解
@SpringBootApplication
@EnableHystrix  // 代表开启 Hystrix 断路器的功能
public class EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

    @LoadBalanced   // 该注解可以让 RestTemplate 请求客户端的时候 拥有负载均衡能力
    @Bean
    public RestTemplate restTemplats(){
        return new RestTemplate();
    }

}
