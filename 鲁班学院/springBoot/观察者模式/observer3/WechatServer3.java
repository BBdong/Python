package com.it.observer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WechatServer3 implements  Runnable{
	
	private List<UserListener> userList = new ArrayList<>();
	
	public static boolean flag = false;
	
	
	
	/**
	 * @Description 用于添加 监听者（观察者）
	 *				  
	 * @param UserListener 
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019年1月7日 - 下午4:16:31  
	 */
	public void addListener(UserListener UserListener) {
		userList.add(UserListener);
	}
	
	/**
	 * @Description 公共号服务推送消息 ，flag标识ture标识推送消息
	 */
	public void push() {
		flag = true;
	}
	/**
	 * @Description 推送完毕将 falg 设置 false
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019年1月7日 - 上午10:07:37  
	 */
	public void noPush() {
		flag = false;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("服务开始推送消息----");
			System.out.println("推送消息中...");
			Thread.sleep(3000);
			push();
			Thread.sleep(2000);
			
			UserEvent UserEvent = new UserEvent();
			UserEvent.setFlag(true);
			for (UserListener userListener : userList) {
				userListener.accept(UserEvent);
			}
			System.out.println("服务推送消息结束----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
