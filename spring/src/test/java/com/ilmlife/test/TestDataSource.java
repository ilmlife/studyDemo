package com.ilmlife.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ilmlife.datasource.model.File;
import com.ilmlife.datasource.service.FileService;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月5日 上午10:32:42
 */
public class TestDataSource {
	@Test
	public void test() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("datasourceBeans.xml");
		FileService service = context.getBean("fileService", FileService.class);
		service.save(new File());
		context.close();
	}
}
