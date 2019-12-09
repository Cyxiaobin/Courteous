package edu.swjtuhc.demo.servicelmpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServicelmpl  implements UserService{
      
	@Autowired
	UserMapper userMapper;

	@Override
	public int register(SysUser user) {
		
		// TODO Auto-generated method stub
		
		
		//调用mapper实现注册
		
		SysUser u0 =userMapper.selectUserByUsername(user.getUsername());
		//做判断 先去查询用户 如果为空再去调用mapper
		int i=-1;                  //先定义i的值
		if (u0==null) {
			i = userMapper.insertUser(user);
		} else {
			i = 2;                //u不等于空 则用户存在
		}
		return i;
	}

	@Override
	public int login(SysUser user) {
		// TODO Auto-generated method stub
		
		//调用mapper实现登陆
		SysUser u0 =userMapper.selectUserByUsername(user.getUsername());
		//先做判断 判断用户名是否存在 若存在再去调用mapper  若不存在 则输出用户名为空或密码错误
		int i=-1; //先定义i的值
		if (u0!=null) {
			i = userMapper.insertUser(user);
		} else {
			System.err.println("用户名不存在或密码错误");
		}
		return i;
	}
}
