/**   
* @Title: IGenericDao.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.web.common.dao;

import java.util.List;

import com.fengzhi.web.common.util.Page;

public interface IGenericDao extends IBaseDao {

	/**
	 * 
	 * @Title: getCount
	 * @Description: (获取总记录数)
	 * @param hql
	 * @return
	 *
	 */
	long getCount(String hql);

	/**
	 * 
	 * @Title: getCount
	 * @Description: (获取总记录数)
	 * @param hql
	 * @param values
	 * @return
	 *
	 */
	long getCount(String hql, Object[] values);

	/**
	 * 
	 * @Title: getSQLCount
	 * @Description: (获取总记录数)
	 * @param sql
	 * @return
	 *
	 */
	long getSQLCount(String sql);

	/**
	 * 
	 * @Title: getSQLCount
	 * @Description: (获取总记录数)
	 * @param sql
	 * @param values
	 * @return
	 *
	 */
	long getSQLCount(String sql, Object[] values);

	public <T> List<T> findToPage(String hql, Page page);

	public <T> List<T> findToPage(String hql, Object[] values, Page page);

}
