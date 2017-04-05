package com.ilmlife.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月9日 下午10:38:40
 */
public class ResultAction extends ActionSupport {
	private static final long serialVersionUID = 5230175730925960476L;
	
	private String result;
	
	public String showDynamicResult() {
		result = "/nameSpace.jsp";
		return SUCCESS;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
