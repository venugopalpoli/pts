/**
 * 
 */
package com.designpatterns.creational.factory;

/**
 * @author vpoli
 *
 */
public class ColorFactory {

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
}
