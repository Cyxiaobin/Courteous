package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.TrolleyMapper;
import edu.swjtuhc.demo.model.Trolley;
import edu.swjtuhc.demo.service.TrolleyService;

/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月10日 下午5:36:39
* 类说明
*/
@Service
public class TrolleyServiceImpl implements TrolleyService {
      
	@Autowired
	TrolleyMapper trollryMapper;
	
	@Override
	public List<Trolley> getTrolleyList() {
		// TODO Auto-generated method stub
		
		return trollryMapper.selectAllTrolleys();
	}
      
}
