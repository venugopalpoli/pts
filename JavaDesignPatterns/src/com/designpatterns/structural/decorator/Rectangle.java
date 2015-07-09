/**
 * 
 */
package com.designpatterns.structural.decorator;

/**
 * @author vpoli
 *
 */
public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see com.design.patterns.structural.decorator.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}

}
