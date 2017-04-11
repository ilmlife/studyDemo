package com.ilmlife.hibernate.model;
/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月8日 上午8:56:36
 */
public class User {
	private int id;
	private String username;
	private String password;
	
	public User(){}
	
	public User(String uname,String upwd) {
		this.username = uname;
		this.password = upwd;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}