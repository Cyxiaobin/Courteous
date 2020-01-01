package edu.swjtuhc.demo.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

public interface ChangeMapper {
	//获取用户所有信息
	 User selectBypassword(@Param("passwords") String passwords,@Param("username") String username);
	     //    修改密码
	    int updateByPrimaryKeySelective(User record);
	
}
