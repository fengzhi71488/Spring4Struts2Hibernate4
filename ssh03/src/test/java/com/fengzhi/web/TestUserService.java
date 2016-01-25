/**   
* @Title: TestUserService.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月25日 
* @version V1.0   
*/
package com.fengzhi.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.fengzhi.web.service.IUserService;

@ContextConfiguration(locations={"applicationContext.xml"})
public class TestUserService {

	@Autowired
	private IUserService userService;

	@Test
	public void test() {
		try {
			userService.findUserById(11);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
