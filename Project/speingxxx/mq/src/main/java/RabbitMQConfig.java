import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQConfig {

    public static void main(String[] args) {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername("root");
            factory.setPassword("root");
            factory.setVirtualHost("/");
            factory.setHost("172.18.44.131");
            factory.setPort(5672);
            Connection conn = factory.newConnection();

           // factory.setUri("amqp://userName:password@hostName:portNumber/virtualHost");
            Channel channel = conn.createChannel();
            //参数1：队列的名称
            //参数2：队列是否需要持久化            true
            //参数3：队列是否只能被当前创建的连接使用（临时队列true）  false
            //参数3：队列如果没有消费是否需要自动删除   false
            //参数4：队列的配置 map（通过创建对象然后put值 来设置队列的消息容器个数、寿命等）
            channel.queueDeclare("Queue1",true,false,false,null);
            //参数1: exchange名称 ，名称不写使用默认交换机 ，路由键则是根据队列名称
            //参数2：队列名，也就是路由键的名称
            //参数3：队列消息的配置
            //参数4：消息内容
            channel.basicPublish("","Queue1",null,"Hello》》".getBytes());
            channel.close();
            conn.close();
            System.out.println(">>>>>>>>>>>>...SUCCESS!");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
