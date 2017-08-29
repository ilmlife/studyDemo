package com.ilmlife.base.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ilmlife.base.jdbc.util.DBUtil;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年5月9日 下午7:43:45
 */
public class JdbcBatchTest {
	public static void main(String[] args) {
		String sql = "insert into ps_test() values(?, ?, ?)";
		
		int count = 0;
		Connection conn = null;
		PreparedStatement pstat = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			pstat = conn.prepareStatement(sql);
			
			while(count < 1000) {
				String line = "";
				String params[] = line.split(",");
				for (int i = 0; i < params.length; i++) {
					pstat.setObject(i + 1, params[i]);
				}
				pstat.addBatch();
				
				count ++;
				if(count % 100 == 0) {
					pstat.executeBatch();
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.release(null, pstat, conn);
		}
	}
}
