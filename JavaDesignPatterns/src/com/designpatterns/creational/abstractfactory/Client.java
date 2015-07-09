/**
 * 
 */
package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.factory.Color;
import com.designpatterns.creational.factory.Shape;

/**
 * @author vpoli
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory abstractFactory = factoryProducer.getFactory("SHAPE");
		Shape shape = abstractFactory.getShape("Circle");
		shape.draw();
		
		shape = abstractFactory.getShape("Rectangle");
		shape.draw();
		
		abstractFactory = factoryProducer.getFactory("COLOR");
		Color color = abstractFactory.getColor("Red");
		color.paint();
		
		color = abstractFactory.getColor("Yellow");
		color.paint();
	}

}
