package edu.swjtuhc.demo.model;
/**
* @author 作者 ：李忠斌
* @version 创建时间：2019年12月27日 下午3:38:55
* 类说明
*/
public class Query {
	private int qId;
	private String userName;
	private String passWord;
	private String Name;
	private int Age;
	private String  Gender;
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Query [qId=" + qId + ", userName=" + userName + ", passWord=" + passWord + ", Name=" + Name + ", Age="
				+ Age + ", Gender=" + Gender + "]";
	}
	
}
