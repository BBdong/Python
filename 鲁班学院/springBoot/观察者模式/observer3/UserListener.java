package com.it.observer3;
/**
 * @Description ���ڽ�� WechatServer3.java ����������۲���  
 * 				�ٲ��ı������������ ����List<UserListener>
 * 				
 * 
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2019��1��7�� - ����4:11:53
 */
public interface UserListener {
	/**
	 * @Description ������������������
	 * 
	 * @author mayadong[863836234@qq.com]
	 * @date 2019��1��7�� - ����4:18:56
	 * @history 2019��1��7�� - ����4:18:56 mayadong[863836234@qq.com] .create
	 */
	public void accept(UserEvent UserEvent);
	
}
