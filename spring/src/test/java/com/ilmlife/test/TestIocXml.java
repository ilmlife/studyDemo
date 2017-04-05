package com.ilmlife.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ilmlife.iocxml.model.User;
import com.ilmlife.iocxml.service.UserService;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 上午11:18:57
 */
public class TestIocXml {
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocXmlBeans.xml");
		UserService service = context.getBean("userService", UserService.class);
		service.save(new User());
		context.close();
	}
	
}