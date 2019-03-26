package interfaceAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Proxy implements TargerInterface{
	
	@Autowired
	private Taget taget;
	
	public void a() {
		// TODO Auto-generated method stub
		taget.a();
		System.out.println("加上日志！");
	}
	
}
