package edu.swjtuhc.demo.mapper;


import java.util.List;

import javax.management.Query;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QueryMapper {
	public List<Query> seleAllQueries();

}
