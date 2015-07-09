/**
 * 
 */
package com.designpatterns.creational.factory;

/**
 * @author vpoli
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("Square");
		shape.draw();
		
		shape = shapeFactory.getShape("Circle");
		shape.draw();
		
		
		ColorFactory colorFactory = new ColorFactory();
		Color color = colorFactory.getColor("Red");
		color.paint();
		
		color = colorFactory.getColor("Yellow");
		color.paint();
	}

}
