/**   
* @Title: TestUserService.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月18日 
* @version V1.0   
*/
package com.fengzhi.web.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		IUserService userService = (IUserService) ac.getBean("userService");

		userService.test();
	}
}
