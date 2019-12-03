package com.po;
//封装业务逻辑
public class UsersDAO {
	public boolean usersLogin(Users u) {
		if("admin".equals(u.getUsername())&&"admin".equals(u.getPassword())) {
			return true;
		}
		return false;
	}
	
}
