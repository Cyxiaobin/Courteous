package edu.swjtuhc.demo.service;

import javax.servlet.http.HttpSession;

public interface ChangeService {
	Object modifyPassqord(String password,String newpassword,String username,HttpSession session );

}
