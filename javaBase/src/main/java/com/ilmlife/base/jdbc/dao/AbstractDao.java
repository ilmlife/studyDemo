package com.ilmlife.base.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ilmlife.base.jdbc.dao.mapping.EntityMapping;
import com.ilmlife.base.jdbc.util.DBUtil;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午7:47:51
 */
public abstract class AbstractDao {
	/**
	 * 根据sql查询出对应结果
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @param entity 用于转换的实体类
	 * @return
	 * @throws Exception
	 */
	public <T> T find(String sql,Object[] args,EntityMapping<T> entity) throws Exception {
		List<T> list = this.query(sql, args, entity, true);
		return (list != null && list.size() > 0) ? list.get(0) : null;
	}
	
	/**
	 * 根据sql查询出对应结果集合
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @param entity 用于转换的实体类
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> findAll(String sql,Object[] args,EntityMapping<T> entity) throws Exception {
		return this.query(sql, args, entity, true);
	}
	
	/**
	 * 更新数据
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @return 更新是否成功
	 * @throws Exception
	 */
	public <T> int update(String sql,Object[] args) throws Exception {
		return this.modify(sql, args);
	}
	
	/**
	 * 新增数据
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @return 新增是否成功
	 * @throws Exception
	 */
	public <T> int add(String sql,Object[] args) throws Exception {
		return this.modify(sql, args);
	}
	
	/**
	 * 删除数据
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @return 删除是否成功
	 * @throws Exception
	 */
	public <T> int delete(String sql,Object[] args)throws Exception {
		return this.modify(sql, args);
	}
	
	/**
	 * 查询
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @param entity 用于转换的实体类
	 * @param queryOnce 是否只查询一次
	 * @return 结果集合
	 * @throws Exception
	 */
	protected <T> List<T> query(String sql,Object[] args,EntityMapping<T> entity,boolean queryOnce) throws Exception {
		List<T> list = new ArrayList<T>();
		
		Connection conn = null;
		PreparedStatement pstat = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstat = conn.prepareStatement(sql);
			if(args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					pstat.setObject(i + 1, args[i]);
				}
			}
			rs = pstat.executeQuery();
			while(rs.next()) {
				list.add(entity.orm(rs));
				if(queryOnce) {
					break;
				}
			}
		}catch(Exception e) {
			throw e;
		}finally {
			DBUtil.release(rs, pstat, conn);
		}
		
		return list;
	}
	
	/**
	 * 更新数据
	 * @param sql sql语句
	 * @param args sql语句中的参数
	 * @return 修改结果
	 * @throws Exception
	 */
	protected int modify(String sql,Object[] args) throws Exception {
		int effect = 0;
		
		Connection conn = null;
		PreparedStatement pstat = null;
		try {
			conn = DBUtil.getConnection();
			pstat = conn.prepareStatement(sql);
			if(args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					pstat.setObject(i + 1, args[i]);
				}
			}
			effect = pstat.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			DBUtil.release(null, pstat, conn);
		}
		return effect;
	}
}