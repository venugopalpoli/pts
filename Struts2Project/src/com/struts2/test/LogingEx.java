/**
 * 
 */
package com.struts2.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author vpoli
 *
 */

public class LogingEx extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 */
	public String execute() {
		if (userName.equals("vpoli") && password.equals("vpoli")) {
			return SUCCESS;
		} else{
			this.addActionError(getText("user.password.wrong")); 
			return ERROR;
		}
	}

	public void validate() {
		if (userName.equals("") || userName.length() == 0)
			this.addFieldError("userName", getText("user.wrong"));
		if (password.equals("") || password.length() == 0)
			this.addFieldError("password", getText("pass.wrong"));
	}
}
