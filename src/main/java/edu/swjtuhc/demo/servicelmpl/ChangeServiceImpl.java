package edu.swjtuhc.demo.servicelmpl;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.service.ChangeService;

@Service
public class ChangeServiceImpl implements ChangeService {
	@Override
	public Object modifyPassqord(String password, String newpassword, String username, HttpSession session) {
		// TODO Auto-generated method stub
		Map<String , Object> map =new HashMap<String, Object>();
		if (password!=null) {
			User user=UserMapper.selectBypassword(password, username);
			//获取用户的id
			//Integer id=user.getId();
			//数据库密码
			 String yspassword=user.getPassword();
			 if(yspassword.equals(password)){
	           
	                //对新密码就行加密
	                user.setPassword(newpassword);
	                //修改数据库的旧密码
	                return UserMapper.updateByPrimaryKeySelective(user);
		}
		return 0;
		}
		return map;
	}
}

