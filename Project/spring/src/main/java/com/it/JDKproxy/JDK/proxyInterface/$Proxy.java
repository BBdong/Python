package com.it.JDKproxy.JDK.proxyInterface;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.it.JDKproxy.JDK.ProxyHandler;
import com.it.proxy.TargetClass;

public class $Proxy {
	public ProxyHandler	variableName;
	public $Proxy (ProxyHandler variableName){
		this.variableName = variableName;
	}
	public String B(String arg0) {
		try {
		Method m = Class.forName("com.it.proxy.TargetClass").getDeclaredMethod("B",String.class);

		Object p [] = { arg0 };
		return (String)variableName.invoke(m,p);
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
	public void A(String arg0, String arg1) {
		try {
		Method m = Class.forName("com.it.proxy.TargetClass").getDeclaredMethod("A",String.class, String.class);

		Object p [] = { arg0, arg1 };
		variableName.invoke(m,p);
		} catch (Throwable e) {
			e.printStackTrace();
			
		}
	}


	public static void main(String[] args) throws Exception {
		TargetClass targetClass = new TargetClass();
		ProxyHandler proxyHandler = new ProxyHandler(targetClass);
		$Proxy a = new $Proxy(proxyHandler);
		a.A("11","11");

	}
	
	

}
