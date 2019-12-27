package edu.swjtuhc.demo.model;
/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月10日 下午5:23:06
* 类说明
*/
public class Trolley {
	private String username;
	private String addess;
	private int money;
	private String goods;
	private int tid;
	
	public int getId() {
		return tid;
	}
	public void setId(int id) {
		this.tid = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddess() {
		return addess;
	}
	
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	
	@Override
	public String toString() {
		return "Trolley [username=" + username + ", addess=" + addess + ", money=" + money + ", goods=" + goods
				+ ", id=" + tid + "]";
	}

}
