package com.wen.eurekafeign.controller;

import com.wen.eurekafeign.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaFeignController {

    @Autowired
    private MyFeignClient myFeignClient;

    @RequestMapping("msg")
    public String getMsg(){
        return myFeignClient.getMsg();
    }

}
