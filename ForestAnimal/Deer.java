package com.forestAnimal;
public class Deer extends HerbivoreAnimal {

    Deer(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the Deer makes a gentle sound.");
    }
}
