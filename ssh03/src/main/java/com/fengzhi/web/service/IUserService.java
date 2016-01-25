/**   
* @Title: IUserService.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月22日 
* @version V1.0   
*/
package com.fengzhi.web.service;

import com.fengzhi.web.entity.User;

public interface IUserService {

	void test();

	/**
	 * @Title: findUserById
	 * @Description: (根据用户id查询用户信息)
	 * @param id
	 * @return
	 *
	 */
	User findUserById(int id) throws Exception;
}
