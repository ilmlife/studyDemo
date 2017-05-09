package com.ilmlife.base.jdbc;

import com.ilmlife.base.jdbc.dao.UserDao;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午8:40:44
 */
public class JdbcTest {
	public static void main(String[] args) throws Exception {
		System.out.println(new UserDao().queryUser("123"));
	}
}
