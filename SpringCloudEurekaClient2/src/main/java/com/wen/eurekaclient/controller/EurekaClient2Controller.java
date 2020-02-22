package com.wen.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EurekaClient2Controller {

    @RequestMapping(value = "/client", produces = "application/json;charset=UTF8")
    public List client(){
        List<String> list = new ArrayList<String>();
        list.add("噢");
        list.add("shi");
        list.add("ge");
        // 在远程调用时,出现自定义的 BUG
//        System.out.println(1/0);
        list.add("ren");
        return list;

    }
}
