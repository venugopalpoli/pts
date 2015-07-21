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

	private Employee employee;
	
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * 
	 */
	public String execute() {
		return SUCCESS;
	}
}
