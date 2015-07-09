/**
 * 
 */
package com.concurrency.thread.localvariable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author vpoli
 *
 */
public class UnsafeTask implements Runnable {

	private Date startDate;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		startDate = new Date();
		System.out.printf("Starting Thread: %s : %s\n", Thread.currentThread().getId(), startDate);
		try {
			TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %s\n", Thread.currentThread().getId(), startDate);
		
	}

}
