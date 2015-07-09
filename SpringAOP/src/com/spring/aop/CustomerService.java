/**
 * 
 */
package com.spring.aop;

/**
 * @author vpoli
 *
 */
public class CustomerService {

	private String name;
	private String url;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printName() {
		System.out.println("Customer name : " + this.name);
	}
 
	public void printURL() {
		System.out.println("Customer website : " + this.url);
	}
 
	public void printThrowException() {
		throw new IllegalArgumentException();
	}

	
}
