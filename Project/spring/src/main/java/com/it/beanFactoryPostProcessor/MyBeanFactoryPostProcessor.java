package com.it.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	//实现这个接口 可以获取到Spring 工厂实现类的父接口ConfigurableListableBeanFactory ，然后可以通过bean的名字获取到 工厂中对应的的beanDefition
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		 BeanDefinition bd = beanFactory.getBeanDefinition("a");
		 System.out.println(">>>>>>>A:"+beanFactory.getBean(A.class));
		 bd.setScope("prototype");
		 System.out.println(">>>>>>>>>已将A的Scope作用域修改成 原型...");
		 
	}

	

}
