package com.ilmlife.datasource.dao;

import com.ilmlife.datasource.model.File;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月5日 上午10:26:30
 */
public interface IFileDao {
	void save(File file) throws Exception;
}
