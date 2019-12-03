package com.po;
/**
 * 用户类
 * @author dell
 *
 */
public class Users {
	private String username;	//用户名	
	private String password;	//密码
	
	//保留默认构造方法
	public Users() {
		
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
