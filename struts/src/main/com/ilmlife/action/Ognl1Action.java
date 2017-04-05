package com.ilmlife.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月13日 下午4:57:18
 */
public class Ognl1Action extends ActionSupport {
	private static final long serialVersionUID = -4964765620503641358L;
	private String name;
	private String age;
	
	public String ognl() {
		return SUCCESS;
	}

	public String getName() {// 通过get方法访问
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

}
