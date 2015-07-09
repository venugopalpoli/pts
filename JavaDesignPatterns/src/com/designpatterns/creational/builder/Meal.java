/**
 * 
 */
package com.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vpoli
 *
 */
public class Meal {

	private List<Item> items;
	private float cost;
	
	public Meal(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		items.add(item);
		cost = cost + item.price();
	}
	
	public float getCost(){
		return cost;
	}
	
	public void showItems(){
		
		for(Item item : items){
			System.out.println("Name : " + item.name() + " Price : " + item.price() + " Packing : " + item.packing().pack());
		}
	}
}
