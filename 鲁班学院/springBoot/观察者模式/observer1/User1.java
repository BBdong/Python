package com.it.observer1;
/**
 * 
 * @Description 为了监听 公众号服务flag值的变化 ，需开启线程
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年1月7日 - 上午9:45:25
 */
public class User1 extends Thread{
	
	private WechatServer we;
	
	public User1(WechatServer we) {
		this.we = we;
	}
	/**
	 * @Description 当公众号的 flag 标识是true时，用户收到消息
	 *				   
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019年1月7日 - 上午9:39:05  
	 * @history
	 *          2019年1月7日 - 上午9:39:05 mayadong[863836234@qq.com]
	 *			.create
	 */
	public void accept() {
		if(we.flag) {
			System.out.println("user:========用户知道公众号推送消息啦！！");
		}
	}
	
	public void run() {
		System.out.println("用户监听中....");
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
