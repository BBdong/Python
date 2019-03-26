package com.it.BeanFactoryAndFactoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

public class T1 implements FactoryBean {
	
	public void a() {
		System.out.println("---");
	}
	
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		return new T2();
	}

	public Class getObjectType() {
		// TODO Auto-generated method stub
		return new T2().getClass();
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
