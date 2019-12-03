package com.po;

public class doUsers {
	public boolean doIt(Users u) {
		if("admin".equals(u.getUsername()) && "admin".equals(u.getPassword())) {
				return true;		
		}else {
			return false;
		}
	}
}
