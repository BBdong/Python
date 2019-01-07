package com.it.observer1;

public class WechatServer implements  Runnable{
	
	public static boolean flag = false;
	/**
	 * @Description �����ŷ���������Ϣ ��flag��ʶture��ʶ������Ϣ
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019��1��7�� - ����9:42:05  
	 * @history
	 *          2019��1��7�� - ����9:42:05 mayadong[863836234@qq.com]
	 *			.create
	 */
	public void push() {
		flag = true;
	}
	/**
	 * @Description ������Ͻ� falg ���� false
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019��1��7�� - ����10:07:37  
	 * @history
	 *          2019��1��7�� - ����10:07:37 mayadong[863836234@qq.com]
	 *			.create
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
			noPush();
			System.out.println("����������Ϣ����----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
