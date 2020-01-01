package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.QueryMapper;
import edu.swjtuhc.demo.service.QueryService;


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
