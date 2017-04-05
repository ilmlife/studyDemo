package com.ilmlife.aopannotation.interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午6:51:14
 */
@Aspect
@Component
public class LogInteceptor {
	@Before("execution(* com.ilmlife.aopannotation.dao.*.*(..))")
	public void before() {
		System.out.println("save before");
	}
	
	@Before("execution(* com.ilmlife.aopannotation.dao.*.*(..))")
	public void beforeAgain() {
		System.out.println("save before again");
	}
	
	@After("execution(* com.ilmlife.aopannotation.dao.*.*(..))")
	public void after() {
		System.out.println("save after");
	}
}