package com.ilmlife.action;

import com.ilmlife.action.mode.UserDTO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author ilmlife E -Mail:ilmlife@126.com
 * @version 1.0 创建时间：2015年12月8日 下午9:09:08
 */
public class MDParamsAction extends ActionSupport implements ModelDriven<UserDTO> {
	private static final long serialVersionUID = -8972961503819320571L;

	private UserDTO dto = new UserDTO();
	
	@Override
	public UserDTO getModel() {
		return dto;
	}

	public String add() {
		System.out.println("ADD_INFO:name=" + dto.getName() + "|age=" + dto.getAge());
		return SUCCESS;
	}
}
