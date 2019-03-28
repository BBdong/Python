package com.it.TEST;

import java.util.regex.Pattern;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.spring.App1;

public class T1 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		BeanFactory bean = null;
		FactoryBean ss = null;
		App1 app1 = (App1) context.getBean("app1");
		app1.app1();
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
