package com.ilmlife.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月9日 上午3:16:22
 */
public class WebElement2Action extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {
	private static final long serialVersionUID = 5476017180599293517L;
	
	private Map<String,Object> request;
	private Map<String,Object> session;
	private Map<String,Object> application;
	
	public String show() {
		request.put("attr1", "222");
		session.put("attr2", "222");
		application.put("attr3", "222");
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
