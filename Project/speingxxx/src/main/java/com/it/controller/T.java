package com.it.controller;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class T implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("将url注册给servlet容器！");
        ServletRegistration.Dynamic con = ctx.addServlet("servlet",new Servlet());
        //配置servlet 映射
        con.addMapping("/html");
        //配置listener
        //配置filter
    }
}
