/**
 * 
 */
package com.designpatterns.creational.abstractfactory;

/**
 * @author vpoli
 *
 */
public class FactoryProducer {

	public AbstractFactory getFactory(String factory){
		
		if(factory != null){
			switch(factory){
				case "SHAPE":
					return new ShapeFactory();
				case "COLOR":
					return new ColorFactory();
			}
		}
		
		return null;
	}
}
