package com.wen.eurekaconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    @HystrixCommand(fallbackMethod = "hiFallback")
    public String getList(){
        /*
        使用 RPC 远程调用技术，来调用 EurekaClient 的接口
            eureka-client   对应于注册中心上服务名称
            client  对应于需要调用的接口映射
         */
        String url = "http://eureka-client/client";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(" ······ 调用注册中心服务 result ：" + result);
        return result;
    }

    public String hiFallback(){
        return "这里出现了 BUG 导致远程调用失败，这是断路器提供的回调方法";
    }

}
