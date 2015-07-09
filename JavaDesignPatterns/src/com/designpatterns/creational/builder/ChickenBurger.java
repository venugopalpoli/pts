package com.designpatterns.creational.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 3.50F;
	}

}
