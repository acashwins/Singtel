package com.singtel.living.mammals;

public interface WalkableAnimals extends Animal{
	default void walk() {
		System.out.println("I am walking");
	}
}
