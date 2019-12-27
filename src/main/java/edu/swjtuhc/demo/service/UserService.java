package edu.swjtuhc.demo.service;
import java.util.List;

import javax.management.Query;

import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
	public int register(SysUser user );
	public int login (SysUser user );
	public List<Query> gtequeryList();
}
