import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@DubboComponentScan(basePackages = "com.it.service")
public class SpringApplicationContext {

    @Bean
    public ApplicationConfig applicationConfig() {
        System.out.println("applicationConfig-----");
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-service");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        System.out.println("registryConfig----");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://172.18.44.137:2181");
        registryConfig.setClient("curator");
        return registryConfig; 
    }
}
