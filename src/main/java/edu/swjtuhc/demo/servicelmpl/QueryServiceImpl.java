package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.QueryMapper;
import edu.swjtuhc.demo.service.QueryService;

/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月27日 下午3:41:57
* 类说明
*/
@Service
public class QueryServiceImpl implements QueryService {
  
	@Autowired
	QueryMapper QueryMapper;
	
	@Override
	public List<Query> getQueryList() {
		// TODO Auto-generated method stub
		return QueryMapper.seleAllQueries();
	}
	

}
