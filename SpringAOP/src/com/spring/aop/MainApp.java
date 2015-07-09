/**
 * 
 */
package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vpoli
 *
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceProxy");
		 
		System.out.println("*************************");
		customerService.printName();
		System.out.println("*************************");
		customerService.printURL();
		System.out.println("*************************");
		try {
			customerService.printThrowException();
		} catch (Exception e) {
 
		}
	}
}
