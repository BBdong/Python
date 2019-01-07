package com.it.observer2;

public class WechatServer2 implements  Runnable{
	
	private User2 user2;
	
	public WechatServer2(User2 user2) {
		this.user2 = user2;
	}
	
	public static boolean flag = false;
	/**
	 * @Description 公共号服务推送消息 ，flag标识ture标识推送消息
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019年1月7日 - 上午9:42:05  
	 * @history
	 *          2019年1月7日 - 上午9:42:05 mayadong[863836234@qq.com]
	 *			.create
	 */
	public void push() {
		flag = true;
	}
	/**
	 * @Description 推送完毕将 falg 设置 false
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019年1月7日 - 上午10:07:37  
	 * @history
	 *          2019年1月7日 - 上午10:07:37 mayadong[863836234@qq.com]
	 *			.create
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
			noPush();
			user2.accept();
			System.out.println("服务推送消息结束----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
