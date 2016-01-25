/**   
* @Title: UserServiceImpl.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengzhi.web.dao.IUserDao;
import com.fengzhi.web.entity.User;
import com.fengzhi.web.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	/**
	 * @Title: findUserById
	 * @Description: (更加用户id查询用户信息)
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	@Override
	public User findUserById(int id) throws Exception {

		return userDao.findById(id);
	}

	/**
	 * @Title: test
	 * @Description: (测试)
	 *
	 */
	@Override
	public void test() {
		userDao.test();

		System.out.println("Test user servie ");
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
