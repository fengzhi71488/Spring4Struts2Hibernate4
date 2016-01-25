/**   
* @Title: UserServiceImpl.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月18日 
* @version V1.0   
*/
package com.fengzhi.web.service.impl;

import com.fengzhi.web.dao.IUserDao;
import com.fengzhi.web.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao;

	/**
	 * @Title: test
	 * @Description: (测试)
	 *
	 */
	@Override
	public void test() {
		System.out.println("Test user service");
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
