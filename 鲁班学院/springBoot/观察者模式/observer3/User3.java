package com.it.observer3;

/**
 * 
 * @Description Ϊ�˼��� ���ںŷ���flagֵ�ı仯 ���迪���߳�
 * 
 * @author mayadong[863836234@qq.com]
 * @date 2019��1��7�� - ����9:45:25
 */
public class User3 implements UserListener {

	@Override
	public void accept(UserEvent UserEvent ) {
		if(UserEvent.isFlag()) {
			System.out.println("user3:========�û�֪�����ں�������Ϣ������");
		}
	}
}
	

