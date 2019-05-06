package com.it.beanFactoryPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.beanPostProcessor.ApplcationConfig;
import com.it.beanPostProcessor.IndexBean;

/**
 * 
 * beanFactoryPostProcessor 可以在Spring 工厂实例化时插手 工厂的设置 
 * 如 Spring工厂中默认bean是单例的  ， 可以在工厂创建bean时设置bean 原型
 * @author mayadong[863836234@qq.com]
 *
 */
public class T1 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ApplcationConfig.class);
		c.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		A bean1= c.getBean(A.class);
		A bean2= c.getBean(A.class);
		System.out.println(bean1.hashCode() + "======" + bean2.hashCode());
	}
	
}
