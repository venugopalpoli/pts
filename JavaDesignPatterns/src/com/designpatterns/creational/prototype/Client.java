/**
 * 
 */
package com.designpatterns.creational.prototype;

/**
 * @author vpoli
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ShapeCache.loadCache();

	      Shape clonedShape = ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());
	      
	      System.out.println(clonedShape.hashCode());

	      clonedShape = ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape.getType());	
	      
	      System.out.println(clonedShape.hashCode());

	      clonedShape = ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape.getType());
	      
	      System.out.println(clonedShape.hashCode());
	}

}
