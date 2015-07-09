/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.Burger#name()
	 */
	@Override
	public String name() {
		return "VegBurger";
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.Burger#price()
	 */
	@Override
	public float price() {
		return 2.50F;
	}

}
