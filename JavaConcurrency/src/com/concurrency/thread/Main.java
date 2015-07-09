/**
 * 
 */
package com.concurrency.thread;

/**
 * @author vpoli
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  // 10 threads run parallel 
		for (int i=1; i<=10; i++){ 
			Calculator calculator=new Calculator(i); Thread thread=new Thread(calculator);
			thread.start();
		}
		 

	}


}
