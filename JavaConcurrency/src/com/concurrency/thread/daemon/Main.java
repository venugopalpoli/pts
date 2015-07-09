/**
 * 
 */
package com.concurrency.thread.daemon;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author vpoli
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<Event> deque = new ArrayDeque<Event>();

		WriterTask writer = new WriterTask(deque);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();

	}

}
