package com.singtel.living.mammals;

public class Parrot implements Animal{
	ParrotLiving living;

	Parrot() {// Set living in constructor by composite.

	}

	public void says() {
		if (living == null) {
			System.out.println("Woof, woof"); // default sound if its not set.
		} else {
			System.out.println(living.getSays());
		}

	}

	public ParrotLiving getLiving() {
		return living;
	}

	public void setLiving(ParrotLiving living) {
		this.living = living;
	}

}
