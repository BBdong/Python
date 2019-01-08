package com.it.observer2;

public class T2 {
	public static void main(String[] args) {
		User2 user2 = new User2();
		WechatServer2 we =new WechatServer2(user2);
		
		
		System.out.println("推送消息前:"+we.flag);
		//server通过线程推送消息
		we.run();
		System.out.println("推送消息后:"+we.flag);
		
		
		
	}
}
