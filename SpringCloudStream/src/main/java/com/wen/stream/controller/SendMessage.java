package com.wen.stream.controller;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 消息管道接口
 */
public interface SendMessage {

//    创建一个输出管道,用于发送消息
    @Output("my_msg")
    SubscribableChannel sendMsg();
}
