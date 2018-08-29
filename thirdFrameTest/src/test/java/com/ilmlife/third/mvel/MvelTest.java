package com.ilmlife.third.mvel;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.mvel2.MVEL;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2018年8月29日 下午10:17:31
 */
public class MvelTest {
	
	@Test
	public void subTest() {
		String expression = "num - 10";
		Map<String, Object> context = new HashMap<>();
		context.put("num", 22);
		Object result = MVEL.eval(expression, context);
		Assert.assertEquals(result, 12);
	}
	
	@Test
	public void udfTest() {
		String expression = "def func(name) {return \"hello:\" + name;} func(name);";
		Map<String, Object> context = new HashMap<>();
		context.put("name", "zhangsan");
		Object result = MVEL.eval(expression, context);
		Assert.assertEquals(result, "hello:zhangsan");
	}
	
	@Test
	public void timeUdfTest() {
		String expression = "def func(date) {java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(\"yyyy-MM-dd\");return sdf.parse(date);} func(date)";
		Map<String, Object> context = new HashMap<>();
		context.put("date", "2018-09-08");
		Object result = MVEL.eval(expression, context);
		Assert.assertTrue(result instanceof java.util.Date);
	}
	
	
	@Test
	public void timeUdfCalcTest() {
		String expression = "def func(date) {java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(\"yyyy-MM-dd\");java.util.Calendar cal = java.util.Calendar.getInstance();cal.setTime(sdf.parse(date));cal.add(java.util.Calendar.DAY_OF_MONTH, -2);return sdf.format(cal.getTime());} func(date)";
		Map<String, Object> context = new HashMap<>();
		context.put("date", "2018-08-08");
		Object result = MVEL.eval(expression, context);
		Assert.assertEquals(result, "2018-08-06");
	}
}
