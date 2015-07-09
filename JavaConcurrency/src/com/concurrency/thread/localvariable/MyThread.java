/**
 * 
 */
package com.concurrency.thread.localvariable;

/**
 * @author vpoli
 *
 */
public class MyThread extends Thread {

	  private static int value = 1;

	  @Override
	  public void run() {

	    System.out.print(value);

	    try {
	      Thread.sleep(5000);
	    } catch (InterruptedException e) {
	    }

	    // Even if another thread called changeValue()
	    // in the meantime the next print instruction is
	    // not guaranteed to write "2"
	    System.out.print(value);
	  }

	  public synchronized void changeValue() {
	    value = value + 1;
	  }

	}

