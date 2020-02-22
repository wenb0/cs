package com.wen.configclient.controller;

import com.wen.configclient.service.ConfigClient2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient2Controller {

    @Autowired
    private ConfigClient2Service configClientService;

    @RequestMapping("/get")
    public String get(){
        return configClientService.getName();
    }

}
