package com.ilmlife.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月9日 上午3:16:22
 */
public class WebElement3Action extends ActionSupport {
	private static final long serialVersionUID = 5476017180599293517L;
	
	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	public WebElement3Action() {
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}
	
	public String show() {
		request.setAttribute("attr1", "333");
		session.setAttribute("attr2", "333");
		application.setAttribute("attr3", "333");
		return SUCCESS;
	}

	
}
