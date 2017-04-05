package com.ilmlife.action;

/**
 * Action方式一
 * 
 * @author silly E -Mail:ilmlife@126.com
 * @version 创建时间：2015年12月7日 下午9:54:41
 */
public class StudyAction1 {
	public String execute() {
		System.out.println("common class");
		return "success";
	}
	
	public String add() {
		System.out.println("common class called add method");
		return "success";
	}
}
