package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mayadong on 2019/1/21.
 */
@Controller
public class T1Controller {


    @GetMapping("/a")
    @ResponseBody
    public String a() {
        return "aaaaa";
    }

}