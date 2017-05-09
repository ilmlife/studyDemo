package com.ilmlife.base.jdbc.dao.mapping;

import java.sql.ResultSet;

import com.ilmlife.base.jdbc.model.User;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午7:45:25
 */
public class UserMapping implements EntityMapping<User> {
	@Override
	public User orm(ResultSet rs) throws Exception {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setUsername(rs.getString("password"));
		return user;
	}
}