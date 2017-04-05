package com.ilmlife.datasource.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ilmlife.datasource.dao.IFileDao;
import com.ilmlife.datasource.model.File;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月5日 上午10:25:40
 */
@Service("fileService")
public class FileService {
	private IFileDao fileDao;

	public void save(File file) throws Exception {
		fileDao.save(file);
	}
	
	public IFileDao getFileDao() {
		return fileDao;
	}
	@Resource(name="fileDao")
	public void setFileDao(IFileDao fileDao) {
		this.fileDao = fileDao;
	}	
}
