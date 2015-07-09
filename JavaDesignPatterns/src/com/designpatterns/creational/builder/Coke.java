/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.ColdDrink#name()
	 */
	@Override
	public String name() {
		return "Coke";
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		return 0.80F;
	}

}
