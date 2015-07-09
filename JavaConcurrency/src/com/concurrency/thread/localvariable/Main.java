/**
 * 
 */
package com.concurrency.thread.localvariable;

import java.util.concurrent.TimeUnit;

/**
 * @author vpoli
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//UnsafeTask task = new UnsafeTask();
		//SafeTask task = new SafeTask();
		SafeTaskInt task = new SafeTaskInt();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(task);
			thread.start(); 
			
			thread = new Thread(task);
			thread.start(); 
			/*try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}

}
