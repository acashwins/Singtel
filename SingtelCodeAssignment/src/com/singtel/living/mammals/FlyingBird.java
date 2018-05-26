package com.singtel.living.mammals;

public interface FlyingBird extends Animal{
	default void fly() {
		System.out.println("I am flying");
	}
}
