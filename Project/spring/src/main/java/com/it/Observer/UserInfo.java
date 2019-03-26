package com.it.Observer;

public class UserInfo implements UserInfoListener {
	
	private String name;
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public void info(Event event) {
		System.out.println(event.getMag());
	}
	
}
