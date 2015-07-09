/**
 * 
 */
package com.concurrency.thread.interrupt;

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
		/*
		 * Thread task=new PrimeGenerator(); task.start(); try {
		 * Thread.sleep(5); } catch (InterruptedException e) {
		 * e.printStackTrace(); } task.interrupt();
		 */

		FileSearch searcher = new FileSearch("C:\\", "autoexec.txt");
		Thread thread = new Thread(searcher);
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
