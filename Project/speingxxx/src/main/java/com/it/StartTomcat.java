package com.it;

import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class StartTomcat implements Runnable {
    @Override
    public void run() {

        //初始化spring容器
        AnnotationConfigWebApplicationContext ApplicaitonContext = new AnnotationConfigWebApplicationContext();
        ApplicaitonContext.register(SpringApplicationContext.class);
        ApplicaitonContext.refresh();
        //将springMVC DsipatcherServlet交给spring容器管理
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ApplicaitonContext);
        Object servlet = ApplicaitonContext.getBean("dispatcherServlet");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>"+servlet);
        //创建tomcat实例
        Tomcat tom = new Tomcat();
        //设置端口
        int port = 8081;
        tom.setPort(port);
        System.out.println(">>>>>>>>>>>开始启动tomcat端口:"+port);
        try{
            //获取项目编译后的claess 路径
            String path = StartTomcat.class.getResource("/").getPath();

            //获取webapp 文件
            String filePath = new File("src/main/webapp").getAbsolutePath();

            //然后将webapp下的项目添加至tomcat的context容器（context对应一个运行的项目）
            Context context =tom.addContext("/speingxxx",filePath);
            System.out.println(">>>>>>>>>>>tomcat容器路径:"+filePath);

            //webResourceRoot 用于加载 项目的class文件
            WebResourceRoot webResource = new StandardRoot(context);
            webResource.addPreResources(new DirResourceSet(webResource,"/WEB-INF/classes",path,"/"));

            //将dispatchServlet交给tomcat ,并取个别名speingxxx  ，跟拦截请求时的映射对应
            Tomcat.addServlet(context,"speingxxx",dispatcherServlet);
            context.addServletMapping("/","speingxxx");
            tom.start();
            System.out.println(">>>>>>>>>>>启动完毕!");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //阻塞 ，等待前端连接
        tom.getServer().await();
    }
}
