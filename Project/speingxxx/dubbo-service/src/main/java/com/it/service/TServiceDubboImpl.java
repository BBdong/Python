package com.it.service;

import com.alibaba.dubbo.config.annotation.Service;


@Service(timeout = 5000,version = "1.0",group = "demo-dubbo")
public class TServiceDubboImpl implements TServiceDubbo{

    public TServiceDubboImpl() {
        System.out.println(">>>>>>>>TServiceImpl服务就绪...");
    }

    @Override
    public String getUserService(String str) {
        System.out.println(">>>>>>>..."+str);
        return str;
    }
}
