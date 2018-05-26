package com.singtel.living.mammals;

public class Rooster implements Animal{
	Chicken chicken;

	Rooster() {
	}
	Rooster(Chicken chicken) {
		this.chicken = chicken;
	}

	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
