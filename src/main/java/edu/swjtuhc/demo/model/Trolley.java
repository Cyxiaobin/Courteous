package edu.swjtuhc.demo.model;

public class Trolley {
	private String userName;
	private String Addess;
	private String Addess2;
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
	
	public String getAddess2() {
		return Addess2;
	}
	public void setAddess2(String addess2) {
		Addess2 = addess2;
	}
	@Override
	public String toString() {
		return "Trolley [userName=" + userName + ", Addess=" + Addess + ", Addess2=" + Addess2 + ", Money=" + Money
				+ ", Age=" + Age + ", tId=" + tId + "]";
	}
	
	

}
