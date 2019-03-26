package com.it.proxy;

public class Proxy implements Interface{

	private TargetClass targetClass; 
	
	public Proxy(TargetClass targetClass) {
		this.targetClass = targetClass;
	}
	
	public void A(String a,String b) {
		System.out.println("添加夹前置日志!");
		targetClass.A(a,b);
	}

	public String B(String a) {
		// TODO Auto-generated method stub
		return a;
	}
	
	
	
	
}


