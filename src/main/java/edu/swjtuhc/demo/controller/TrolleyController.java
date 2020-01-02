package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Trolley;
import edu.swjtuhc.demo.service.TrolleyService;


@RestController
@RequestMapping("/trolley")
public class TrolleyController {
	
	@Autowired
	TrolleyService trollryService;
	
	@RequestMapping("/getlist")
	public List<Trolley> getTrolleys(){
		//返回值 返回一个列表
		return trollryService.getTrolleyList() ;
	}
}
