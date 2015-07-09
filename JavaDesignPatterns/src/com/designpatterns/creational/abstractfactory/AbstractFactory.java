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
public abstract class AbstractFactory {

	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
