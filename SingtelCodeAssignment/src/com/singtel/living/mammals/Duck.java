package com.singtel.living.mammals;

import com.singtel.living.aquatic.Swimmer;

public class Duck implements FlyingBird, Swimmer {

	public void sing() {
		System.out.println("Quack, quack");
	}

}
