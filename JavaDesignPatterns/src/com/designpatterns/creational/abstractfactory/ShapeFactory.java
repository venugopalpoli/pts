/**
 * 
 */
package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.factory.Circle;
import com.designpatterns.creational.factory.Color;
import com.designpatterns.creational.factory.Rectangle;
import com.designpatterns.creational.factory.Shape;
import com.designpatterns.creational.factory.Square;

/**
 * @author vpoli
 *
 */
public class ShapeFactory extends AbstractFactory{

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

	@Override
	public Color getColor(String color) {
		return null;
	}
}
