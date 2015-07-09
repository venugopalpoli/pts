/**
 * 
 */
package com.concurrency.thread.exception;

/**
 * @author vpoli
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Task task=new Task();
		 Thread thread=new Thread(task);
		 thread.setUncaughtExceptionHandler(new ExceptionHandler());
		 thread.start();

	}


}
