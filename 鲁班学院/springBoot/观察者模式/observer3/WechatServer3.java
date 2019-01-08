package com.it.observer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WechatServer3 implements  Runnable{
	
	private List<UserListener> userList = new ArrayList<>();
	
	public static boolean flag = false;
	
	
	
	/**
	 * @Description ������� �����ߣ��۲��ߣ�
	 *				  
	 * @param UserListener 
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019��1��7�� - ����4:16:31  
	 */
	public void addListener(UserListener UserListener) {
		userList.add(UserListener);
	}
	
	/**
	 * @Description �����ŷ���������Ϣ ��flag��ʶture��ʶ������Ϣ
	 */
	public void push() {
		flag = true;
	}
	/**
	 * @Description ������Ͻ� falg ���� false
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019��1��7�� - ����10:07:37  
	 */
	public void noPush() {
		flag = false;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("����ʼ������Ϣ----");
			System.out.println("������Ϣ��...");
			Thread.sleep(3000);
			push();
			Thread.sleep(2000);
			
			UserEvent UserEvent = new UserEvent();
			UserEvent.setFlag(true);
			for (UserListener userListener : userList) {
				userListener.accept(UserEvent);
			}
			System.out.println("����������Ϣ����----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
