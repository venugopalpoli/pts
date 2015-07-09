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

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer salary;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("ID : " + this.id);
		stringBuilder.append(" FirstName : " + this.firstName);
		stringBuilder.append(" LastName : " + this.lastName);
		stringBuilder.append(" Salary : " + this.salary);
		
		return stringBuilder.toString();
	}
	
}
