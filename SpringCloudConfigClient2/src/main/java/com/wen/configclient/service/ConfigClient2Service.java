package com.wen.configclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope   // 标记在访问 /refresh 的时候进行更新操作
public class ConfigClient2Service {

    @Value("${name}")   // 属性文件中的 key，将 key 对应的 value 配置到我们变量中
    private String name;

    public String getName() {
        return name;
    }

}
