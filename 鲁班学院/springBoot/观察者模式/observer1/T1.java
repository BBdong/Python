package com.it.observer1;

public class T1 {
	public static void main(String[] args) {
		WechatServer we =new WechatServer();
		User1 user1 = new User1(we);
		Thread t = new Thread(user1);
		t.start();
		
		
		System.out.println("推送消息前:"+we.flag);
		//server通过线程推送消息
		we.run();
		System.out.println("推送消息后:"+we.flag);
		
		
		
	}
}
