package com.it.observer1;
/**
 * 
 * @Description Ϊ�˼��� ���ںŷ���flagֵ�ı仯 ���迪���߳�
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019��1��7�� - ����9:45:25
 */
public class User1 extends Thread{
	
	private WechatServer we;
	
	public User1(WechatServer we) {
		this.we = we;
	}
	/**
	 * @Description �����ںŵ� flag ��ʶ��trueʱ���û��յ���Ϣ
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019��1��7�� - ����9:39:05  
	 * @history
	 *          2019��1��7�� - ����9:39:05 mayadong[863836234@qq.com]
	 *			.create
	 */
	public void accept() {
		if(we.flag) {
			System.out.println("user:========�û�֪�����ں�������Ϣ������");
		}
	}
	
	public void run() {
		System.out.println("�û�������....");
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(we.flag) {
				System.out.println(we.flag);
	        	accept();
	        }
		}
			
    }
}
