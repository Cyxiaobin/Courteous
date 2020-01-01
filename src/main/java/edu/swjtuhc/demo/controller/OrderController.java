package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import edu.swjtuhc.demo.model.Trolley;
import edu.swjtuhc.demo.service.OrderService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService OrderService;
	
	@RequestMapping("/getorder")
	public JSONObject getorder( @RequestBody Trolley order) {
		JSONObject reJsonObject= new JSONObject();
		//调用Service
		OrderService.getorder(order);
		reJsonObject.put("state", 1);
		
		return reJsonObject;
		
	}

}
