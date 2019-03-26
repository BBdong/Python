package com.it.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler{

	private TargetClass targetClass; 
	
	public JDKProxy(TargetClass targetClass) {
		this.targetClass = targetClass;
	}
	
	/**
	 * proxy 代理对象吧
	 * Method 目标对象
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("方法调用之前写一些日志");
        //调用代理方法
        Object obj = method.invoke(targetClass,args);
        
        System.out.println("方法调用之后写一些日志");
		
		return obj;
	}
	
}
