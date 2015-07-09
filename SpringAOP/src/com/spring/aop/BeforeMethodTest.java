/**
 * 
 */
package com.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author vpoli
 *
 */
public class BeforeMethodTest implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objects, Object object)
			throws Throwable {
		System.out.println("BeforeMethod : Before method Advice : " + method);
		
	}
	

}
