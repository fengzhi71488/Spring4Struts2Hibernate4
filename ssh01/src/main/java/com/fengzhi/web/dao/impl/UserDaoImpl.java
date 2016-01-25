/**   
* @Title: UserDaoImpl.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月18日 
* @version V1.0   
*/
package com.fengzhi.web.dao.impl;

import com.fengzhi.web.core.dao.impl.BaseDaoImpl;
import com.fengzhi.web.dao.IUserDao;

public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
