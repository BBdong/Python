package com.it.proxy;

public class TargetClass implements Interface{

	public void A(String a,String b) {
		// TODO Auto-generated method stub
		System.out.println("---------------假装查询！");
	}
	
	public String B(String a) {
		// TODO Auto-generated method stub
		System.out.println("---------------假装查询！");
		return a;
	}
	
}
