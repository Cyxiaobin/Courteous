package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.OrderMapper;
import edu.swjtuhc.demo.model.Trolley;
import edu.swjtuhc.demo.service.OrderService;
@Service

public class OrderSerivceImpl implements OrderService {

	
	@Autowired
	OrderMapper orderMapper;
	@Override
	public int getorder(Trolley order) {
		// TODO Auto-generated method stub
		//调用mapper
		int o1= orderMapper.inserorder(order);
    	
		return o1;
	}
	

}
