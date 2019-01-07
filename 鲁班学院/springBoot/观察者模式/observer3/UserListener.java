package com.it.observer3;
/**
 * @Description 用于解决 WechatServer3.java 中依赖多个观察者  
 * 				再不改变类代码的情况下 依赖List<UserListener>
 * 				
 * 
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年1月7日 - 下午4:11:53
 */
public interface UserListener {
	/**
	 * @Description 监听触发后做的事情
	 * 
	 * @author mayadong[863836234@qq.com]
	 * @date 2019年1月7日 - 下午4:18:56
	 * @history 2019年1月7日 - 下午4:18:56 mayadong[863836234@qq.com] .create
	 */
	public void accept(UserEvent UserEvent);
	
}
