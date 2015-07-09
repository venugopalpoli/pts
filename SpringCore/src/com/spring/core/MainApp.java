/**
 * 
 */
package com.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vpoli
 *
 */
public class MainApp {

	public static void main(String[] args) {
		
	//	AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config_1.xml");
		
		SampleVO sampleVO = (SampleVO) applicationContext.getBean("sampleVO");
		
		sampleVO.getMessage();
		
		SampleVO1 sampleVO1 = (SampleVO1) applicationContext.getBean("sampleVO1");
		
		sampleVO1.getMessage();
		
		applicationContext.registerShutdownHook();
	}
}
