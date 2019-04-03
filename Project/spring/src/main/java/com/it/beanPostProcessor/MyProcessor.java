package com.it.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements BeanPostProcessor{

	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("indexBean".equals(beanName)) {
			System.out.println(">>>>>>执行 后置处理器....1111");
			
			
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		InterFaceBean beanProxy = null;
		Object obj = null;
		
		if("indexBean".equals(beanName)) {
			System.out.println(">>>>>>执行 后置处理器....2222");
			//使用动态代理扩展spring Bean  并通过后置处理器交易IOC容器和管理 
			//
			
			//注意： 不在在 后置处理器 也就是ben类中 依赖注入对象 ，否则会报 null   ，可能处理器记载的
			//时候 依赖注入已经运行完毕了  ，或者考虑使用 ceglib 应该是可以完成注入的
			IndexBean indexBean = new IndexBean();
			Proxy proxy = new Proxy(indexBean);  //使用注解了  ， 不使用注解应从写构造器 或 set 方法
			obj = java.lang.reflect.Proxy.newProxyInstance(T1.class.getClassLoader(), IndexBean.class.getInterfaces(), proxy);
			InterFaceBean beanProy =  (InterFaceBean)obj;
			beanProy.a();
		}
		return null;
	}

}
