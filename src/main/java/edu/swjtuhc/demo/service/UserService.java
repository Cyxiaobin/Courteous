package edu.swjtuhc.demo.service;

import javax.servlet.http.HttpSession;

import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
	public int register(SysUser user );
	public int login (SysUser user );
	public static int modifyPassword(String password, String newpassword, String username, HttpSession session) {
		// TODO Auto-generated method stub
		return 0;
	}
}
