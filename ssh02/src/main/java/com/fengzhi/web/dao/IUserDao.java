/**   
* @Title: IUserDao.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.web.dao;

import com.fengzhi.common.dao.IGenericDao;
import com.fengzhi.web.entity.User;

public interface IUserDao extends IGenericDao{

	void test();

	/**  
	* @Title: findById
	* @Description: (这里用一句话描述这个方法的作用) 
	* @param id
	* @return  
	*
	*/
	User findById(int id);
}
