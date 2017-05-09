package com.ilmlife.base.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月12日 上午10:37:47
 */
public class DBUtil {
	private static String DB_DRIVERS;
	private static String DB_URL;
	private static String DB_USER;
	private static String DB_PASSWORD;
	
	public DBUtil() {
		
	}
	
	static {
		DBConfig config = DBConfig.getInstance();
		DB_DRIVERS = config.getProperty(DBConstant.DB_DRIVERS);
		DB_URL = config.getProperty(DBConstant.DB_URL);
		DB_USER = config.getProperty(DBConstant.DB_USERNAME);
		DB_PASSWORD = config.getProperty(DBConstant.DB_PASSWORD);
	}
	
	/**
	 * 获取数据库连接
	 * @return conn 数据库连接
	 * @throws ClassNotFoundException if the class cannot be located
	 * @throws SQLException if a database access error occurs
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn = null;
			try {
				// 1.注册数据库驱动程序
				Class.forName(DB_DRIVERS);
				// 2.获取数据库连接对象
				conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			} catch (ClassNotFoundException e) {
				throw new ClassNotFoundException("数据库驱动注册失败" + e.getMessage());
			}catch (SQLException e) {
				throw new SQLException("获取数据库连接对象失败" + e.getMessage());
			}
		
		return conn;
	}
	
	/**
	 * 释放数据库连接
	 */
	public static void release(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
