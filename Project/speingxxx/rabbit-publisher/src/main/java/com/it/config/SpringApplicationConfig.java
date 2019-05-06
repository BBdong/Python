package com.it.config;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.it")
public class SpringApplicationConfig {

       /* @Bean
        public ConnectionFactory connectionFactory() {
            CachingConnectionFactory connectionFactory = new CachingConnectionFactory("172.18.44.131", 5672);
            connectionFactory.setUsername("root");
            connectionFactory.setPassword("root");
            connectionFactory.setVirtualHost("/");
            connectionFactory.setPublisherConfirms(true);
            return  connectionFactory;

        }*/

}
