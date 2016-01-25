/**   
* @Title: UserDaoImpl.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.web.dao.impl;

import com.fengzhi.common.dao.impl.GenericDaoImpl;
import com.fengzhi.web.dao.IUserDao;
import com.fengzhi.web.entity.User;

public class UserDaoImpl extends GenericDaoImpl implements IUserDao {

	/**
	 * @Title: findById
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @param id
	 * @return
	 *
	 */
	@Override
	public User findById(int id) {

		return this.getHibernateTemplate().get(User.class, id);
	}

	/**
	 * @Title: test
	 * @Description: (测试)
	 *
	 */
	@Override
	public void test() {
		System.out.println("Test user dao ");
	}
}
