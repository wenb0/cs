package com.wen.consumer.controller;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerController {

    @StreamListener
    public void instener(String msg){
        System.out.println("消费者 获得了生产者传递的消息："+ msg);
    }

}
