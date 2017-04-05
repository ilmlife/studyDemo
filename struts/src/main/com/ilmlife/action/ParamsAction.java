package com.ilmlife.action;

import com.ilmlife.action.mode.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Action接收参数
 * 
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月7日 下午11:31:06
 */
public class ParamsAction extends ActionSupport {
	private static final long serialVersionUID = -4118208065024143014L;
	private String name;
	private String age;
	
	private UserInfo user;
	
	public String add1() {
		System.out.println("ADD1_INFO:name=" + name + "|age=" + age);
		return SUCCESS;
	}
	
	public String add2() {
		System.out.println("ADD2_INFO:name=" + user.getName() + "|age=" + user.getAge());
		return SUCCESS;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
}
