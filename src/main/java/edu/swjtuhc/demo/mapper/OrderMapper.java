package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Trolley;


@Mapper
public interface OrderMapper {

	int inserorder(Trolley order);
	//public int inserorder( Trolley order);

}
