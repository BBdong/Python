package appConfig;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboProviderConfig {


    //<dubbo:application name="boot-user-service-provider"></dubbo:application>

    //<dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>

    //<dubbo:protocol name="dubbo" port="20882"></dubbo:protocol>

    /**
     *<dubbo:service interface="com.atguigu.gmall.service.UserService"
     ref="userServiceImpl01" timeout="1000" version="1.0.0">
     <dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>
     </dubbo:service>
     */

}
