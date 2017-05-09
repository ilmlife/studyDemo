package com.ilmlife.base.jdbc.dao;

import com.ilmlife.base.jdbc.dao.mapping.UserMapping;
import com.ilmlife.base.jdbc.model.User;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午8:38:14
 */
public class UserDao extends AbstractDao {
	public User queryUser(String id) throws Exception {
		String sql = "select * from user where id = ?";
		return super.find(sql, new Object[]{"123"}, new UserMapping());
	}
}