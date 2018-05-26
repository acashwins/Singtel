package com.singtel.living.aquatic;

public interface Swimmer{
	public default void swim() {
		System.out.println("duck is swiming");		
	}
}
