package com.singtel.living.mammals;

import com.singtel.living.aquatic.ButterFly;
import com.singtel.living.aquatic.ClownFish;
import com.singtel.living.aquatic.Dolphin;
import com.singtel.living.aquatic.Fish;
import com.singtel.living.aquatic.Shark;
import com.singtel.living.aquatic.Swimmer;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(), 
				new Parrot(),
				new Fish(),
				new Shark(), 
				new ClownFish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new ButterFly(),
				new Cat()
				};
		
		for(Animal animal : animals) {
			if(animal instanceof FlyingBird) {
				System.out.println("Flying bird");
			} 
			
			if(animal instanceof Bird){
				System.out.println("singing...");
			}
			
			if(animal instanceof Swimmer){
				System.out.println("swiming");
			}
			
			System.out.println("walk...");
			
		}
		}
		
	}
