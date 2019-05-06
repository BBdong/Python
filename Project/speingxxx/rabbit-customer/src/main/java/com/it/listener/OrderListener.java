package com.it.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    public OrderListener() {
        System.out.println(">>>>>>>>>>>>>监听....");
    }

    @RabbitListener(queues = "orderQueue")
    public void orderListener(String message) throws Exception{
        System.out.println(message);
    }


}
