package com.ilmlife.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月9日 上午3:16:22
 */
public class WebElement1Action extends ActionSupport {
	private static final long serialVersionUID = 5476017180599293517L;
	
//	private Map<String,Object> request;
//	private Map<String,Object> session;
//	private Map<String,Object> application;
	
	
	public WebElement1Action() {
//		request = (Map<String,Object>) ActionContext.getContext().get("request");
//		session = ActionContext.getContext().getSession();
//		application = ActionContext.getContext().getApplication();
	}
	
	@SuppressWarnings("unchecked")
	public String show() {
//		request.put("attr1", "attr1111");
//		session.put("attr2", "attr2222");
//		application.put("attr3", "attr3333");
		((Map<String,Object>) ActionContext.getContext().get("request")).put("attr1", "111");
		ActionContext.getContext().getSession().put("attr2", "111");
		ActionContext.getContext().getApplication().put("attr3", "111");
		return SUCCESS;
	}
}
