package com.it.Observer;
/**
 * 加入用户第一次登录成功，就推送事件 ，假设如果是 小明 ，则该用户是第一次登录
 * @Description
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019年2月20日 - 下午2:40:31
 */

import java.util.ArrayList;
import java.util.List;

public class Login {
	
	List<UserInfoListener> userss = new ArrayList<>();
	
	public Login(List<UserInfoListener> users) {
		userss.addAll(users);
		System.out.println("---");
	}
	
	/**
	 * 登录  ，  为了 让；login 适应所有用户的操作 ，添加 userList 集合
	 * @Description
	 *				  
	 * @param user
	 * @return 
	 * @author mayadong[863836234@qq.com]     
	 * @date 2019年2月20日 - 下午2:43:24  
	 * @history
	 *          2019年2月20日 - 下午2:43:24 mayadong[863836234@qq.com]
	 *			.create
	 */
	public void push (Event e) {
		for (UserInfoListener user : userss) {
			if("1".equals(e.getFlag())) {
				e.setMag("首次登录！");
				user.info(e);
			}else {
				e.setMag("非首次登录！");
				user.info(e);
			}
		}
	}
}
