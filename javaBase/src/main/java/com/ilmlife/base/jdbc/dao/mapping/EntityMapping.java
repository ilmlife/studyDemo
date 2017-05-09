package com.ilmlife.base.jdbc.dao.mapping;

import java.sql.ResultSet;


/**
 * 对象实体转换接口
 *  
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午7:44:48
 */
public interface EntityMapping<T> {
	/**
	 * 根据数据库结果集转换为java对象
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public T orm(ResultSet rs) throws Exception;
}
