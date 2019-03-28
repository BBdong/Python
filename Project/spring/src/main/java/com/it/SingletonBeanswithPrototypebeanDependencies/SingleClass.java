package com.it.SingletonBeanswithPrototypebeanDependencies;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SingleClass implements ApplicationContextAware {
	
	
	@Autowired
	ApplicationContext applicationContext;
	
	public PrototypeClass a() {
		PrototypeClass prototypeClass = applicationContext.getBean(PrototypeClass.class);
		return prototypeClass;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	
}
