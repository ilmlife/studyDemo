package com.ilmlife.action;

import com.opensymphony.xwork2.Action;

/**
 * Action方式二
 * 
 * @author silly E -Mail:ilmlife@126.com
 * @version 创建时间：2015年12月7日 下午10:03:48
 */
public class StudyAction2 implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("implements Action class");
		return SUCCESS;
	}

	public String add() {
		System.out.println("implements Action class called add method");
		return SUCCESS;
	}
}
