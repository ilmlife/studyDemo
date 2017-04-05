package com.ilmlife.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ilmlife.iocann.model.Player;
import com.ilmlife.iocann.service.PlayerService;



/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 下午10:04:03
 */
public class TestIocAnnotation {
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocAnnBeans.xml");
		PlayerService service = context.getBean("playerService", PlayerService.class);
		service.save(new Player());
		context.close();
	}
}
