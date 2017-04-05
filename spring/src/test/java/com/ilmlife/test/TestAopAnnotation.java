package com.ilmlife.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ilmlife.aopannotation.model.Department;
import com.ilmlife.aopannotation.service.DepartmentService;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午6:49:14
 */
public class TestAopAnnotation {
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopAnnBeans.xml");
		DepartmentService service = context.getBean("departmentService", DepartmentService.class);
		service.save(new Department());
		context.close();
	}
}
