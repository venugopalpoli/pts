/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public abstract class ColdDrink implements Item {

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.Item#name()
	 */
	@Override
	public abstract String name() ;

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.builder.Item#price()
	 */
	@Override
	public abstract float price();

}
