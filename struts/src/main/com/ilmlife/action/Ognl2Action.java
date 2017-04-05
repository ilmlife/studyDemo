package com.ilmlife.action;

import java.util.ArrayList;
import java.util.List;

import com.ilmlife.action.mode.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月13日 下午4:57:18
 */
public class Ognl2Action extends ActionSupport {
	private static final long serialVersionUID = -4964765620503641358L;
	private UserInfo user = new UserInfo();
	
	private List<UserInfo> users = new ArrayList<UserInfo>();
	
	public Ognl2Action() {
		users.add(new UserInfo(18));
		users.add(new UserInfo(19));
		users.add(new UserInfo(20));
	}
	
	public String ognl() {
		return SUCCESS;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public String show() {
		return "Ognl2Action.show()";
	}

	public List<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(List<UserInfo> users) {
		this.users = users;
	}
	
}
