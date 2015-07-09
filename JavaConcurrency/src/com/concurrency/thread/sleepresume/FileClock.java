/**
 * 
 */
package com.concurrency.thread.sleepresume;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author vpoli
 *
 */
public class FileClock implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s\n", new Date());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				System.out.printf("The FileClock has been interrupted");
			}
		}

	}

}
