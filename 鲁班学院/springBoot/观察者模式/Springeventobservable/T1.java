package com.it.Springeventobservable;

import java.util.regex.Pattern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.TEST.SpringContext;

public class T1 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		context.getBean(Server.class).push();
		
	}
	

	
	public static boolean judgeTwoDecimal(Object obj){  
        boolean flag = false;  
        try {  
            if(obj != null){  
                String source = obj.toString();  
                // 判断是否是整数或者是携带一位或者两位的小数  
                Pattern pattern = Pattern.compile("^[+]?([0-9]+(.[0-9]{1,2})?)$");  
                if(pattern.matcher(source).matches()){  
                    flag = true;  
                }    
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return flag;  
    } 
	

}
