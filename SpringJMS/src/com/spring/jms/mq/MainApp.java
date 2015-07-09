/**
 * 
 */
package com.spring.jms.mq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vpoli
 *
 */
public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		
		SampleSender sampleSender = (SampleSender)applicationContext.getBean("sampleSender");
		
		sampleSender.sendMessage();
		
	}
}
