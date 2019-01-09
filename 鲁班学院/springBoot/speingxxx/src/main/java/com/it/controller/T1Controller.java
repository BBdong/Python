package com.it.controller;

import com.it.service.T1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class T1Controller {

    @Autowired
    private T1Service t1Service;

    @RequestMapping("/t1")
    @ResponseBody
    public String t1() {
        return t1Service.t1();
    }
}
