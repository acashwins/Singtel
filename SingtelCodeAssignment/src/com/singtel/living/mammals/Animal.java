package com.singtel.living.mammals;

public interface Animal {
	default void walk() {
		System.out.println("I am walking");
	}
}
