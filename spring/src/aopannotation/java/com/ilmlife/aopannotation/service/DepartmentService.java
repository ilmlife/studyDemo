package com.ilmlife.aopannotation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ilmlife.aopannotation.dao.IDepartmentDao;
import com.ilmlife.aopannotation.model.Department;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午6:45:51
 */
@Service(value="departmentService")
public class DepartmentService {
	private IDepartmentDao departmentDao;

	public void save(Department department) {
		departmentDao.save(department);
	}
	
	public IDepartmentDao getDepartmentDao() {
		return departmentDao;
	}
	@Resource(name="departmentDao")
	public void setDepartmentDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
}
