/**   
* @Title: LoginAction.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.web.action;

import com.fengzhi.common.action.BaseAction;
import com.fengzhi.web.entity.User;
import com.fengzhi.web.service.IUserService;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {

	private IUserService userService;

	public String execute() throws Exception {

		return SUCCESS;
	}

	public void doLogin() throws Exception {
		log.info("do login");

		User user = userService.findUserById(11);

		if (user != null) {
			log.info("当前登录用户：" + user.getUsername());
		} else {
			log.warn("登录失败。");
		}
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
