/**
 * 
 */
package com.concurrency.thread.sleepresume;

import java.util.Collections;
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

		FileClock clock = new FileClock();
		Thread thread = new Thread(clock);
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
	}

}
