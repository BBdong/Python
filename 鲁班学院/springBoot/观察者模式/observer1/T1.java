package com.it.observer1;

public class T1 {
	public static void main(String[] args) {
		WechatServer we =new WechatServer();
		User1 user1 = new User1(we);
		Thread t = new Thread(user1);
		t.start();
		
		
		System.out.println("������Ϣǰ:"+we.flag);
		//serverͨ���߳�������Ϣ
		we.run();
		System.out.println("������Ϣ��:"+we.flag);
		
		
		
	}
}
