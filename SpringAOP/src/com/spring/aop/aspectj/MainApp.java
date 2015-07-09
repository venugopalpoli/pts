/**
 * 
 */
package com.spring.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vpoli
 *
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config_aspectj.xml");
		CustomerBo customer = (CustomerBo) applicationContext.getBean("customerBo");
		customer.addCustomer();
		
		customer.addCustomerReturnValue();
		
		try {
			customer.addCustomerThrowException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		customer.addCustomerAround("venu");
	}
}
