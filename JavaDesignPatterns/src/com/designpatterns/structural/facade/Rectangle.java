/**
 * 
 */
package com.designpatterns.structural.facade;

/**
 * @author vpoli
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("This is Rectangle");
	}
}
