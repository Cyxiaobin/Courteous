package edu.swjtuhc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.service.UserService;

@RestController

@RequestMapping("/Change")

public class ChangeController {
	//修改密码 
@RequestMapping("/ChangePassWord")
public Object updatePassWord(String password,String newpassword,String username,HttpSession session){
    Map<String,Object> map=new HashMap<>();
    
    int i= (int) UserService.modifyPassword( password, newpassword, username, session);
    if(i==1){
        map.put("code",1);
        map.put("msg","修改成功！");

    }else {
        map.put("code",0);
        map.put("msg","修改失败");
    }

    return  map;

}
//修改用户名
//@RequestMapping("/ChangeName")
//public 
}
