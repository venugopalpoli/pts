/**
 * 
 */
package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.factory.Blue;
import com.designpatterns.creational.factory.Color;
import com.designpatterns.creational.factory.Red;
import com.designpatterns.creational.factory.Shape;
import com.designpatterns.creational.factory.Yellow;

/**
 * @author vpoli
 *
 */
public class ColorFactory extends AbstractFactory{

	public Color getColor(String color){
		
		if(color != null){
			switch(color){
				case "Red":
					return new Red();
				case "Blue":
					return new Blue();
				case "Yellow":
					return new Yellow();
			}
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
