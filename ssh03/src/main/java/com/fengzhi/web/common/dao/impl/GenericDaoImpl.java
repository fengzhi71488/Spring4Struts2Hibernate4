/**   
* @Title: GenericDaoImpl.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月20日 
* @version V1.0   
*/
package com.fengzhi.web.common.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;

import com.fengzhi.web.common.dao.IGenericDao;
import com.fengzhi.web.common.util.Page;

public class GenericDaoImpl extends BaseDaoImpl implements IGenericDao {

	/**
	 * @Title: getCount
	 * @Description: (获取总记录数)
	 * @param hql
	 * @return
	 *
	 */
	@Override
	public long getCount(String hql) {
		return getCount(hql, null);
	}

	/**
	 * @Title: getCount
	 * @Description: (获取总记录数)
	 * @param hql
	 * @param values
	 * @return
	 *
	 */
	@Override
	public long getCount(String hql, Object[] values) {
		// 截取字符串，将统计语句加入
		StringBuffer countHql = new StringBuffer("select count(*) ");
		countHql.append(hql.substring(hql.toLowerCase().lastIndexOf("from"), hql.length()));

		return getHibernateTemplate().execute(new HibernateCallback<Long>() {
			public Long doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery(countHql.toString());

				// 判断是否有查询语句参数需要设置
				if (values != null) {
					for (int i = 0; i < values.length; i++) {
						query.setParameter(i, values[i]);
					}
				}

				return (Long) query.uniqueResult();
			}
		});
	}

	/**
	 * @Title: getSQLCount
	 * @Description: (获取总记录数)
	 * @param sql
	 * @return
	 *
	 */
	@Override
	public long getSQLCount(String sql) {

		return getSQLCount(sql, null);
	}

	/**
	 * @Title: getSQLCount
	 * @Description: (获取总记录数)
	 * @param sql
	 * @param values
	 * @return
	 *
	 */
	@Override
	public long getSQLCount(String sql, Object[] values) {
		// 截取字符串，将统计语句加入
		StringBuffer countHql = new StringBuffer("select count(*) ");
		countHql.append(sql.substring(sql.toLowerCase().lastIndexOf("from"), sql.length()));

		return getHibernateTemplate().execute(new HibernateCallback<Long>() {
			public Long doInHibernate(Session session) throws HibernateException {
				SQLQuery query = session.createSQLQuery(countHql.toString());

				// 判断是否有查询语句参数需要设置
				if (values != null) {
					for (int i = 0; i < values.length; i++) {
						query.setParameter(i, values[i]);
					}
				}

				return (Long) query.uniqueResult();
			}
		});
	}

	public <T> List<T> findToPage(String hql, Page page) {
		return findToPage(hql, null, page);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> List<T> findToPage(String hql, Object[] values, Page page) {
		log.info("分页查询,返回list集合");

		return (List<T>) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery(hql);

				if (values != null) {
					for (int i = 0; i < values.length; i++) {
						query.setParameter(i, values[i]);
					}
				}

				query.setFirstResult(page.getBeginIndex()).setMaxResults(page.getEveryPage());

				return query.list();
			}
		});
	}
}
