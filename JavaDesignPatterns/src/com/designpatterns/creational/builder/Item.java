/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
