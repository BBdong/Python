package SpringbootMain;

import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import sun.rmi.runtime.Log;

@Slf4j
@EnableAsync
@SpringBootApplication
@ComponentScan("com.it.controller")
public class Application {
    public static void main(String[] args) {
        log.info(">>>>>>>>>>>>>>>>>>>>开始启动项目....");
        SpringApplication.run(Application.class, args);
        log.info(">>>>>>>>>>>>>>>>>>>>开始启动成功....");
    }
}

