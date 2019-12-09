package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user") //user接口
public class UserController {
	 
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")//用户注册接口
	public JSONObject register(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		//调用service层
		int i =  userService.register(user);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/login")//用户登陆接口
	public JSONObject login( @RequestBody SysUser user ) {
		JSONObject log = new JSONObject();
		
		//调用service层
		int i = userService.login(user);
		log.put("put", i);
		return log;
	}
	
}
