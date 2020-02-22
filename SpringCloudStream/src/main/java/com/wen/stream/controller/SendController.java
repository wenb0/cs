package com.wen.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SendController {

    @Autowired
    private SendMessage sendMessage;

    @RequestMapping("send")
    public String sendMsg(){
        String s = UUID.randomUUID().toString();
        System.out.println("生产者发送消息：" + s);
        Message<byte[]> build = MessageBuilder.withPayload(s.getBytes()).build();
        sendMessage.sendMsg().send(build);
        return "SUCCESS";
    }

}
