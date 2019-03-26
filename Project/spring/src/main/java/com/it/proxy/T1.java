package com.it.proxy;

public class T1 {
	
	public static void main(String[] args) {
		
		TargetClass targetClass = new TargetClass();
		
		Proxy p = new Proxy(targetClass);
		
		//p.A("777");
		
		JDKProxy JDKProxy = new JDKProxy(targetClass);
		Object obj = java.lang.reflect.Proxy.newProxyInstance(T1.class.getClassLoader(), TargetClass.class.getInterfaces(), JDKProxy);
		Interface  t = (Interface) obj; 
		System.out.println(t.B("2"));
	}

}
