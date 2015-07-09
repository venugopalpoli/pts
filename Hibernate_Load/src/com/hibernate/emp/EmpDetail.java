/**
 * 
 */
package com.hibernate.emp;

import java.io.Serializable;
import java.util.Date;

/**
 * @author vpoli
 *
 */
public class EmpDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer empId;
	private Employee employee;
	private String compName;
	private String compDesc;
	private String remark;
	private Date listedDate;
	
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
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
	 * @return the compName
	 */
	public String getCompName() {
		return compName;
	}
	/**
	 * @param compName the compName to set
	 */
	public void setCompName(String compName) {
		this.compName = compName;
	}
	/**
	 * @return the compDesc
	 */
	public String getCompDesc() {
		return compDesc;
	}
	/**
	 * @param compDesc the compDesc to set
	 */
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the listedDate
	 */
	public Date getListedDate() {
		return listedDate;
	}
	/**
	 * @param listedDate the listedDate to set
	 */
	public void setListedDate(Date listedDate) {
		this.listedDate = listedDate;
	}
	
}
