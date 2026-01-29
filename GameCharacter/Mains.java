package com.problemstatement;

/* ================= MAIN CLASS ================= */
public class Mains {
    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[4];

        characters[0] = new Warrior("Arjun", 100, 5, 80);
        characters[1] = new Mage("Ishani", 90, 6, 120);
        characters[2] = new Archer("Veer", 85, 4, 40);
        characters[3] = new EliteWarrior("Raghav", 120, 8, 100, "Dragon Blade");

        for (GameCharacter c : characters) {
            c.displayInfo();
            c.attack();              // Runtime polymorphism
            c.attack("Special Weapon"); // Compile-time polymorphism
            c.attack(90);            // Compile-time polymorphism
            c.defend();
            System.out.println("--------------------------------");
        }

        System.out.println("All characters defend!");
    }
}
