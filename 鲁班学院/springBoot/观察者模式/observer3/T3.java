package com.it.observer3;

public class T3 {
	public static void main(String[] args) {
		User3 user3 = new User3();
		User4 user4 = new User4();
		
		WechatServer3 we = new WechatServer3();
		we.addListener(user3);
		we.addListener(user4);
		
		System.out.println("������Ϣǰ:"+we.flag);
		//serverͨ���߳�������Ϣ
		we.run();
		System.out.println("������Ϣ��:"+we.flag);
		
	}
}
