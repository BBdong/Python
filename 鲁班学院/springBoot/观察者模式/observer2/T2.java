package com.it.observer2;

public class T2 {
	public static void main(String[] args) {
		User2 user2 = new User2();
		WechatServer2 we =new WechatServer2(user2);
		
		
		System.out.println("������Ϣǰ:"+we.flag);
		//serverͨ���߳�������Ϣ
		we.run();
		System.out.println("������Ϣ��:"+we.flag);
		
		
		
	}
}
