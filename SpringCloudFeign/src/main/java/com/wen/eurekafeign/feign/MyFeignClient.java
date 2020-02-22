package com.wen.eurekafeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component  // 将其交给 IOC 容器管理
@FeignClient("eureka-client")   // value 需要调用的服务名称
public interface MyFeignClient {

    @RequestMapping("/client")
    String getMsg();

}
