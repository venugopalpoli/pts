/**
 * 
 */
package com.spring.jdbc;

/**
 * @author vpoli
 *
 */
public class Student {
	   private Integer age;
	   private String name;
	   private Integer id;
	   private String location;

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	   
}
