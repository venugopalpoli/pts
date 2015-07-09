/**
 * 
 */
package com.designpatterns.creational.factory;

/**
 * @author vpoli
 *
 */
public class ShapeFactory {

	public Shape getShape(String shape){
		
		if(shape != null){
			switch(shape){
				case "Circle":
					return new Circle();
				case "Rectangle":
					return new Rectangle();
				case "Square":
					return new Square();
			}
		}
		
		return null;
	}
}
