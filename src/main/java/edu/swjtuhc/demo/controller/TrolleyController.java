package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Trolley;
import edu.swjtuhc.demo.service.TrolleyService;

/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月10日 下午5:18:31
* 类说明
*/
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
