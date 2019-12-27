package edu.swjtuhc.demo.mapper;
/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月27日 下午3:43:15
* 类说明
*/

import java.util.List;

import javax.management.Query;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QueryMapper {
	public List<Query> seleAllQueries();

}
