package com.wem.eurekazuul;

import com.wem.eurekazuul.filter.MyZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
/*
 * @SpringCloudApplication 包含以下三个注解
 * @SpringBootApplication
 * @EnableDiscoveryClient
 * @EnableCircuitBreaker
*/
@SpringCloudApplication
@EnableZuulProxy // 开启网关功能
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }

    @Bean
    public MyZuulFilter myZuulFilter(){
        return new MyZuulFilter();
    }

}
