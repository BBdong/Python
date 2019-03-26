package interfaceAOP;

import org.springframework.stereotype.Component;

@Component
public class Taget implements TargerInterface {

	public void a() {
		// TODO Auto-generated method stub
		System.out.println("假装查询");
	}
	
	
}
