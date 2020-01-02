package edu.swjtuhc.demo.controller;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.service.QueryService;


@RestController
@RequestMapping("/query")
public class QueryController {
	
	@Autowired
	QueryService QueryService;
	
	@RequestMapping("/getlist")
	public List<Query> getList(){
		
		return QueryService.getQueryList();
	}
	

}
