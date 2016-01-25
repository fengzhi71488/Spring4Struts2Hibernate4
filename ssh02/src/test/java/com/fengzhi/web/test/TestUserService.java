/**   
* @Title: TestUserService.java 
* @Description:(测试配置文件是否正确) 
* @author fyf  
* @date 2016年1月18日 
* @version V1.0   
*/
package com.fengzhi.web.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengzhi.web.entity.User;
import com.fengzhi.web.service.IUserService;

public class TestUserService {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		// 获取应用程序上下文
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 获取 userService bean
		IUserService userService = (IUserService) ac.getBean("myUserService");

		// 执行测试方法
		userService.test();
		try {
			User user = userService.findUserById(11);

			System.out.println(user.getUsername());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
