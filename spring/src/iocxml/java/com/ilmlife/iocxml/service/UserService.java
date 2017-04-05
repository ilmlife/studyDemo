package com.ilmlife.iocxml.service;

import com.ilmlife.iocxml.dao.IUserDao;
import com.ilmlife.iocxml.model.User;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 上午11:08:05
 */
public class UserService {
	private IUserDao userDao;
	
	public void save(User user) {
		userDao.save(user);
	}

	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}
