/**
 * 
 */
package com.designpatterns.structural.facade;

/**
 * @author vpoli
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();
	}

}
