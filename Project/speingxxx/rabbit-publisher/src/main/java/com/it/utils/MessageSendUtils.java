package com.it.utils;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSendUtils {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     * @param exchangeName
     * @param rouingKey
     * @param content
     */
    public void sendMessage(String exchangeName,String rouingKey, String content ){
        rabbitTemplate.convertAndSend(exchangeName,rouingKey,content);
    }

    public static void main(String[] args) {

    }

}
