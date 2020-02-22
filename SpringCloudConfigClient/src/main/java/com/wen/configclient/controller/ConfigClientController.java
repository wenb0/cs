package com.wen.configclient.controller;

import com.wen.configclient.service.ConfigClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Autowired
    private ConfigClientService configClientService;

    @RequestMapping("/get")
    public String get(){
        return configClientService.getName();
    }

}
