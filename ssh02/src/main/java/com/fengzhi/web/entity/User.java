/**   
* @Title: User.java 
* @Description:(用户实体类) 
* @author fyf  
* @date 2016年1月19日 
* @version V1.0   
*/
package com.fengzhi.web.entity;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -6239725900011986369L;

	private int id;
	private int userCode;
	private String username;
	private String password;
	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserCode() {
		return userCode;
	}

	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
