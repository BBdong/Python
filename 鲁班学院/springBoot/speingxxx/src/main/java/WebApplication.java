import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class WebApplication implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletCxt) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //初始化spring容器
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringApplicationContext.class);
        context.refresh();
        //将springMVC DsipatcherServlet交给spring容器管理
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        //将 dispatcherServlet 放入 ServletContext 容器

        ServletRegistration.Dynamic  registratione = servletCxt.addServlet("xx",dispatcherServlet);
        //创建一个sevlet
        registratione.addMapping("/");
        registratione.setLoadOnStartup(1);
    }


}
