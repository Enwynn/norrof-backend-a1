package Attributes;

import Enums.ClassDamage;
import Enums.ClassType;
import User.Character;
import lombok.Getter;

public class Attributes {
    @Getter  private int level = 1;
    @Getter private double strength;
    @Getter private double dexterity;
    @Getter private double intelligence;
    @Getter private Character character;
    private boolean damageBool;


    public Attributes(Character character, int strength, int dexterity, int intelligence) {
        this.character = character;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }


    public boolean levelUp() {
        ClassType e = character.getClassType();
        return switch (e) {
            case Ranger -> levelUpHelper(1, 5, 1);
            case Rogue -> levelUpHelper(1, 4, 1);
            case Warrior -> levelUpHelper(3, 2, 1);
            case Mage -> levelUpHelper(1, 1, 5);
        };
    }

    private boolean levelUpHelper(int s, int d, int i) {
        strength = strength + s;
        dexterity = dexterity + d;
        intelligence = intelligence + i;
        return true;
    }

    public double getDamage() {
        ClassDamage e = character.getClassDamage();
        return switch (e) {
            case DEXTERITY -> 1 * (dexterity * 0.001);
            case STRENGTH -> 1 * (strength * 0.001);
            case INTELLIGENCE -> 1 * (intelligence * 0.001);
        };
    }

    @Override
    public String toString() {
        return  " Level = " + level + "\n" +
                " Strength = " + strength + "\n" +
                " Dexterity = " + dexterity + "\n" +
                " Intelligence = " + intelligence + "\n" + "-----------------------";
    }
}
