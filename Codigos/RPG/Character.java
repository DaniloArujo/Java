package Codigos.RPG;

public class Character {
    String name;
    Race race;
    Class class1;
    int health;
    int damage;



    Character(String name, Race race, Class class1){
        this.name = name;
        this.race = race;
        this.class1 = class1;
        health = class1.healthBase + race.healtModifier ;
        damage = class1.damageBase + race.damageModifier;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Race: " + race.name);
        System.out.println("Class: " + class1.name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
    }
}
