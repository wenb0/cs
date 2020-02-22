package com.wen.consumer.controller;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RedMsg {

//    从管道中获取消息
    @Input("my_msg")
    SubscribableChannel redMsg();

}
