/**
 * 
 */
package com.spring.aop.aspectj;

/**
 * @author vpoli
 *
 */
public interface CustomerBo {

	void addCustomer();
	 
	String addCustomerReturnValue();
 
	void addCustomerThrowException() throws Exception;
 
	void addCustomerAround(String name);

}
