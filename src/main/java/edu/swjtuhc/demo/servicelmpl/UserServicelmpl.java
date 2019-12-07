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
}
