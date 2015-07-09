/**
 * 
 */
package com.designpatterns.structural.filter;

/**
 * @author vpoli
 *
 */
public class Person {

	private String name;
	private String gender;
	private String maritalStatus;
	
	/**
	 * @param name
	 * @param gender
	 * @param maritalStatus
	 */
	public Person(String name, String gender, String maritalStatus){
	      this.name = name;
	      this.gender = gender;
	      this.maritalStatus = maritalStatus;		
	   }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
}
