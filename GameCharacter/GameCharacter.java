package com.problemstatement;

/* ================= BASE CLASS ================= */
class GameCharacter {
    String name;
    int health;
    int level;

    GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    /* -------- Method Overloading -------- */
    void attack() {
        System.out.println(name + " attacks normally.");
    }

    void attack(String weapon) {
        System.out.println(name + " attacks using " + weapon + ".");
    }

    void attack(int powerLevel) {
        System.out.println(name + " attacks with power level " + powerLevel + ".");
    }

    void defend() {
        System.out.println(name + " defends against the attack.");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Health: " + health + ", Level: " + level);
    }
}

/* ================= WARRIOR ================= */
class Warrior extends GameCharacter {
    int strength;

    Warrior(String name, int health, int level, int strength) {
        super(name, health, level);
        this.strength = strength;
    }

    @Override
    void attack() {
        System.out.println("Warrior " + name + " attacks with sword!");
    }

    void powerStrike() {
        System.out.println(name + " performs a powerful strike!");
    }
}

/* ================= MAGE ================= */
class Mage extends GameCharacter {
    int mana;

    Mage(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    @Override
    void attack() {
        System.out.println("Mage " + name + " casts a fire spell!");
    }

    void castSpell() {
        System.out.println(name + " casts a powerful spell!");
    }
}

/* ================= ARCHER ================= */
class Archer extends GameCharacter {
    int arrows;

    Archer(String name, int health, int level, int arrows) {
        super(name, health, level);
        this.arrows = arrows;
    }

    @Override
    void attack() {
        System.out.println("Archer " + name + " shoots arrows!");
    }

    void rapidShot() {
        System.out.println(name + " performs a rapid shot!");
    }
}

/* ================= ELITE WARRIOR (MULTILEVEL) ================= */
class EliteWarrior extends Warrior {
    String specialWeapon;

    EliteWarrior(String name, int health, int level, int strength, String specialWeapon) {
        super(name, health, level, strength);
        this.specialWeapon = specialWeapon;
    }

    @Override
    void attack() {
        System.out.println("Elite Warrior " + name + " attacks using " + specialWeapon + "!");
    }

    void ultimateMove() {
        System.out.println(name + " uses the ultimate move!");
    }
}


