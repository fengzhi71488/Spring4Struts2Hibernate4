/**   
* @Title: LoginAction.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月22日 
* @version V1.0   
*/
package com.fengzhi.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fengzhi.web.common.action.BaseAction;
import com.fengzhi.web.entity.User;
import com.fengzhi.web.service.IUserService;

@SuppressWarnings("serial")
@Namespace("/")
@Component
@Scope("prototype")
public class LoginAction extends BaseAction {
	@Autowired
	private IUserService userService;

	@Action(value = "index", results = { @Result(name = "success", location = "/WEB-INF/jsp/login.jsp") })
	public String index() {
		log.info(" login page ");

		userService.test();
		try {
			User user = userService.findUserById(11);
			log.info(user.getUsername());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
