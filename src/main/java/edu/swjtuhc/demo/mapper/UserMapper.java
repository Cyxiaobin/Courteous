package edu.swjtuhc.demo.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public SysUser selectUserByUsername(String username);
	public int insertUser (SysUser user);
	
	//修改密码
	public static User selectBypassword(String password, String username) {
		// TODO Auto-generated method stub
		return null;
	}
	public static Object updateByPrimaryKeySelective(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}

