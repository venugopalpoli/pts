/**
 * 
 */
package com.concurrency.thread.localvariable;

/**
 * @author vpoli
 *
 */
public class MyThread1 extends Thread {

	  private static volatile  int value = 1;

	  @Override
	  public void run() {

	    System.out.print(value);

	    try {
	      Thread.sleep(5000);
	    } catch (InterruptedException e) {
	    }

	    // Even if another thread called changeValue()
	    // in the meantime the next print instruction is
	    // guaranteed to write "2"
	    System.out.print(value);
	  }

	  public void changeValue() {
	    value = value + 1;
	  }

	}

