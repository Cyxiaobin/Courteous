package edu.swjtuhc.demo.model;
/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月10日 下午5:23:06
* 类说明
*/
public class Trolley {
	private String userName;
	private String Addess;
	private int Money;
	private int Age;
	private int tId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddess() {
		return Addess;
	}
	public void setAddess(String addess) {
		Addess = addess;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Trolley [userName=" + userName + ", Addess=" + Addess + ", Money=" + Money + ", Age=" + Age + ", tId="
				+ tId + "]";
	}
	
	

}
