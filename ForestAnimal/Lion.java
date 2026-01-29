package com.forestAnimal;

public class Lion extends WildAnimal {

    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the Lion roars loudly!");
    }
}
