/**
 * 
 */
package com.designpatterns.creational.builder;

/**
 * @author vpoli
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.prepareNonVegMeal();

		meal.showItems();
		System.out.println(meal.getCost());
	}

}
