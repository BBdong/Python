package com.it.observer3;

/**
 * 
 * @Description 为了监听 公众号服务flag值的变化 ，需开启线程
 * 
 * @author mayadong[863836234@qq.com]
 * @date 2019年1月7日 - 上午9:45:25
 */
public class User4 implements UserListener {

	@Override
	public void accept(UserEvent UserEvent) {
		System.out.println("user4:========用户知道公众号推送消息啦！！");
	}
	
}
	

