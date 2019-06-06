package com.it.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>    开始启动！");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(">>>>>>>>>>>>    启动结束！");

    }

}