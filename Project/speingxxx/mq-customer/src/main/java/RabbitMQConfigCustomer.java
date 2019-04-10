import com.rabbitmq.client.*;

import java.io.IOException;

public class RabbitMQConfigCustomer {

    public static void main(String[] args) {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername("root");
            factory.setPassword("root");
            factory.setVirtualHost("/");
            factory.setHost("172.18.44.131");
            factory.setPort(5672);
            Connection conn = factory.newConnection();

            Channel channel = conn.createChannel();

            DefaultConsumer callBack = new DefaultConsumer(channel){
                @Override
                //监听到有消息发布 调这handleDelivery个方法
                //参数1：消费者标识
                //参数2：envelope 获取交换机、路由键、消息标识
                //参数3：properties 消息配置
                //参数4：body  消息内容
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    System.out.println("获取到的消息内容>>>>>>>>>>>>>>："+new String(body,"UTF-8"));
                }
            };
            //路由键名称
            channel.basicConsume("Queue1",callBack);

        }catch (Exception e) {
            e.printStackTrace();
        }


    }

}
