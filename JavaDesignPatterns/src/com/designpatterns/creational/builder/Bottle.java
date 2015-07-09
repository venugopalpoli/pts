/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public class Bottle implements Packing {

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.Packing#pack()
	 */
	@Override
	public String pack() {
		return "This is Bottle";
	}

}
