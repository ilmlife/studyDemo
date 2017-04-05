package com.ilmlife.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ilmlife.aopxml.model.Goods;
import com.ilmlife.aopxml.service.GoodsService;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午3:21:14
 */
public class TestAopXml {
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopXmlBeans.xml");
		GoodsService service = context.getBean("goodsService", GoodsService.class);
		service.save(new Goods());
		context.close();
		
	}
}
