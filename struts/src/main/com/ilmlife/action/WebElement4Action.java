package com.ilmlife.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月9日 上午3:16:22
 */
public class WebElement4Action extends ActionSupport implements ServletRequestAware{
	private static final long serialVersionUID = 5476017180599293517L;
	
	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	public String show() {
		request.setAttribute("attr1", "444");
		session.setAttribute("attr2", "444");
		application.setAttribute("attr3", "444");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
		this.application = session.getServletContext();
	}

	
}
