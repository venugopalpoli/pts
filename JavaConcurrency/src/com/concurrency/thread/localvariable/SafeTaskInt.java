/**
 * 
 */
package com.concurrency.thread.localvariable;

import java.util.concurrent.TimeUnit;

/**
 * @author vpoli
 *
 */
public class SafeTaskInt implements Runnable {
	private static int val = 0;
	private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return new Integer(val++);
		}
	};
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		System.out.printf("Starting Thread: %s : %d\n", Thread.currentThread().getId(), value.get().intValue());
		try {
			TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %d\n", Thread.currentThread().getId(), value.get().intValue());
		
	}

}
