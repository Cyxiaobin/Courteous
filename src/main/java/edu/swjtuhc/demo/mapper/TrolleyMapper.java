package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Trolley;

/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月10日 下午5:37:13
* 类说明
*/
@Mapper
public interface TrolleyMapper {
	public List<Trolley> selectAllTrolleys();

}
