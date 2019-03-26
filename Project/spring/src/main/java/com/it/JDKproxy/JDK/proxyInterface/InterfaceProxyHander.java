package com.it.JDKproxy.JDK.proxyInterface;

import java.lang.reflect.Method;

public interface InterfaceProxyHander {
	/***
	 * JDK动态代理接口
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	public Object invoke(Method method,Object [] p)
	        throws Throwable;
}	
