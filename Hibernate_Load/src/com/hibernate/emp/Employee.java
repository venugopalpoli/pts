/**
 * 
 */
package com.hibernate.emp;

import java.io.Serializable;

/**
 * @author vpoli
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer empId;
	private String empCode;
	private String empName;
	private EmpDetail empDetail;
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
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}
	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDetail
	 */
	public EmpDetail getEmpDetail() {
		return empDetail;
	}
	/**
	 * @param empDetail the empDetail to set
	 */
	public void setEmpDetail(EmpDetail empDetail) {
		this.empDetail = empDetail;
	}

}
