/**
 * 
 */
package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author vpoli
 *
 */
public class InitHelloWorld  implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("AfterInitialization : " + beanName);

		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		return bean;
	}

}
