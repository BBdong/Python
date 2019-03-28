package com.it.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.it.service.T1Service;
import com.it.service.TServiceDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class T1Controller {

    public T1Controller() {
        System.out.println(">>>>>>>>>T1Controller");
        // org.springframework.web.SpringServletContainerInitializer;
    }

    @Autowired
    private T1Service t1Service;


//    @Reference(version = "1.0",group = "demo-dubbo")
//    public TServiceDubbo tServiceDubbo;

    @RequestMapping("/t1")
    @ResponseBody
    public String t1() {
        System.out.println("===================");
       // return tServiceDubbo.getUserService("dubbo>>>>>>success!");
        return "";
    }
}
