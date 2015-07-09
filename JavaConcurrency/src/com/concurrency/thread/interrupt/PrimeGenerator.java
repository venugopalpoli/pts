/**
 * 
 */
package com.concurrency.thread.interrupt;

/**
 * @author vpoli
 *
 */
public class PrimeGenerator extends Thread {

	@Override
	public void run() {
		long number = 1L;
		while (true) {
			if (isPrime(number)) {
				System.out.println("Number " + number + " is Prime");
			}
		
			if (isInterrupted()) {
				 System.out.println("The Prime Generator has been Interrupted");
				 return;
			}
			number++;
		}
	}

	private boolean isPrime(long number) {
		long i = 1, count = 0;
		while (i <= number) {
			if ((number % i) == 0) {
				count++;
			}
			i++;
		}

		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}
}
