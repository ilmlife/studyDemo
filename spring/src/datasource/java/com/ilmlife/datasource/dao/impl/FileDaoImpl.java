package com.ilmlife.datasource.dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ilmlife.datasource.dao.IFileDao;
import com.ilmlife.datasource.model.File;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月5日 上午10:27:32
 */
@Repository("fileDao")
public class FileDaoImpl implements IFileDao {
	private DataSource dataSource;
	
	@Override
	public void save(File file) throws Exception {
		Connection conn = dataSource.getConnection();
		Statement stat = conn.createStatement();
		int ret = stat.executeUpdate("insert into tb_file(name, location) values('test', 'test')");
		System.out.println("save result:" + ret);
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}