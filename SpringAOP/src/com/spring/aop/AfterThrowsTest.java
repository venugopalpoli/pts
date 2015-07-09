/**
 * 
 */
package com.spring.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author vpoli
 *
 */
public class AfterThrowsTest implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("AfterThrowException : Throw exception !" + e);
	}

}
