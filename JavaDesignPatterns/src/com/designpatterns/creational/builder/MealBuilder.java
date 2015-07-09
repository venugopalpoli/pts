/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		
		Item item = new VegBurger();
		meal.addItem(item);
		
		item = new Pepsi();
		meal.addItem(item);
		
		return meal;
	}

	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		
		Item item = new ChickenBurger();
		meal.addItem(item);
		
		item = new Coke();
		meal.addItem(item);
		
		return meal;
	}
}
