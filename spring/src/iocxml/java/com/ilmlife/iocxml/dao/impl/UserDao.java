package com.ilmlife.iocxml.dao.impl;

import com.ilmlife.iocxml.dao.IUserDao;
import com.ilmlife.iocxml.model.User;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 上午11:05:09
 */
public class UserDao implements IUserDao {
	@Override
	public void save(User user) {
		System.out.println("user saveing");
	}
}