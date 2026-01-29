package com.forestAnimal;

public class HerbivoreAnimal extends ForestAnimal {
	HerbivoreAnimal(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound() {
		System.out.println(name + "is a herbivore animal and makes a soft sound");
	}
	
}

