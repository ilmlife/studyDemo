package com.ilmlife.aopannotation.dao.impl;

import org.springframework.stereotype.Repository;

import com.ilmlife.aopannotation.dao.IDepartmentDao;
import com.ilmlife.aopannotation.model.Department;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午6:44:50
 */
@Repository(value="departmentDao")
public class DepartmentDao implements IDepartmentDao {

	@Override
	public void save(Department department) {
		System.out.println("department saving...");
	}

}
