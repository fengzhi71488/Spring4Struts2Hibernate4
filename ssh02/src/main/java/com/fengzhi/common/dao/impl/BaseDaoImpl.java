/**   
* @Title: IBaseDao.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.common.dao.impl;

import java.util.logging.Logger;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class BaseDaoImpl extends HibernateDaoSupport {

	public Logger log = Logger.getLogger(getClass().getName());
}
