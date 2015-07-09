/**
 * 
 */
package com.concurrency.thread.localvariable;

/**
 * @author vpoli
 *
 */
public class MyThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}

}
