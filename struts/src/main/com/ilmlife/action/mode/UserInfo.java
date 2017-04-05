package com.ilmlife.action.mode;

import java.io.Serializable;

/**
 * 
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月7日 下午11:40:41
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 5045257333778574716L;
	
	private String name;
	private int age;
	
	public UserInfo() {
	}
	public UserInfo(int age) {
		super();
		this.age = age;
	}
	
	private ScoreInfo score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ScoreInfo getScore() {
		return score;
	}
	public void setScore(ScoreInfo score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return this.getName() + "|" + this.getAge();
	}
	
	public String show() {
		return "accessMethod";
	}
}
