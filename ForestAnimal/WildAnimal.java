package com.forestAnimal;

public class WildAnimal extends ForestAnimal {

    WildAnimal(String name, int age) {
        super(name, age); 
    }

    @Override
    void makeSound() {
        System.out.println(name + " is a wild animal and makes a loud sound.");
    }
}
