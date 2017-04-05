package com.ilmlife.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action方式三
 * 
 * @author silly E -Mail:ilmlife@126.com
 * @version 创建时间：2015年12月7日 下午10:04:41
 */
public class StudyAction3 extends ActionSupport {
	private static final long serialVersionUID = -5416906688834068834L;

	@Override
	public String execute() throws Exception {
		System.out.println("extends ActionSupprot class");
		return SUCCESS;
	}
	
	public String add() {
		System.out.println("extends ActionSupprot class called add method");
		return SUCCESS;
	}
	
	public String delete() {
		System.out.println("extends ActionSupprot class called delete method");
		return SUCCESS;
	}
}
