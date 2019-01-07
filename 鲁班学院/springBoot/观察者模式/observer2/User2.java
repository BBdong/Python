package com.it.observer2;

/**
 * 
 * @Description 为了监听 公众号服务flag值的变化 ，需开启线程
 * 
 * @author mayadong[863836234@qq.com]
 * @date 2019年1月7日 - 上午9:45:25
 */
public class User2 extends Thread {

	/**
	 * @Description 当公众号的 flag 标识是true时，用户收到消息
	 * 
	 * @author mayadong[863836234@qq.com]
	 * @date 2019年1月7日 - 上午9:39:05
	 * @history 2019年1月7日 - 上午9:39:05 mayadong[863836234@qq.com] .create
	 */
	public void accept() {
		System.out.println("user:========用户知道公众号推送消息啦！！");
	}

}
