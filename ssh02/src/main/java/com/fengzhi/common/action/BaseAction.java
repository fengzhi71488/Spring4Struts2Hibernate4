/**   
* @Title: BaseAction.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.common.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport {

	public Logger log = Logger.getLogger(this.getClass().getName());

}
