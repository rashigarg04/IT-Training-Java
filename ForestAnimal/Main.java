package com.forestAnimal;

public class Main {
    public static void main(String[] args) {

        ForestAnimal animal1 = new Lion("Simba", 5);
        ForestAnimal animal2 = new Deer("Bambi", 3);
        ForestAnimal animal3 = new WildAnimal("Wolf", 4);
        ForestAnimal animal4 = new HerbivoreAnimal("Elephant", 10);

        // Dynamic Method Dispatch
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal4.makeSound();
    }
}
