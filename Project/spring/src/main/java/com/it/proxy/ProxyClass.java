package com.it.proxy;
public class ProxyClass implements Interface{
	public TargetClass	variableName;
	public ProxyClass(TargetClass variableName){
		this.variableName = variableName;
	}
	public String B(String a) {
		System.out.println(1);
		return a;
	}
	public void A(String a,String b) {
		
		System.out.println(1);
	}

}