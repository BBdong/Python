package com.it;

import com.it.config.SpringApplicationConfig;
import com.it.test.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class T {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplicationConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.order();
    }

}
