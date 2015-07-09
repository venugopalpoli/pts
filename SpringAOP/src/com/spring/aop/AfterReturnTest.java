/**
 * 
 */
package com.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author vpoli
 *
 */
public class AfterReturnTest implements AfterReturningAdvice {

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object object, Method method, Object[] objects,
			Object object2) throws Throwable {
		 System.out.println("AfterReturning Method : After method " + method);
	}

}
