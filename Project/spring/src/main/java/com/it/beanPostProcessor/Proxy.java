package com.it.beanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

	

public class Proxy implements InvocationHandler{
	
	public IndexBean indexBean;
	
	public Proxy(IndexBean indexBean) {
		super();
		this.indexBean = indexBean;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("》》》》》》》》》》》》前置通知...........");
		Object obj = method.invoke(indexBean, args);
		System.out.println("》》》》》》》》》》》》后置通知...........");
		return obj;
	}
	
}


