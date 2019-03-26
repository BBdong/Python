package com.it.JDKproxy.JDK;

import java.lang.reflect.Method;

import com.it.JDKproxy.JDK.proxyInterface.InterfaceProxyHander;
import com.it.proxy.TargetClass;

public class ProxyHandler implements InterfaceProxyHander{

	private TargetClass targetClass;
	public ProxyHandler(TargetClass targetClass) {
		this.targetClass = targetClass;
	}
	

	public Object invoke(Method method,Object [] p) throws Throwable {
		
		System.out.println("===前置 逻辑===");
		Object obj =  method.invoke(targetClass, p);
		System.out.println("===前置 逻辑===");
		
		return obj;
	}
	
	
	

	
	
		
}
