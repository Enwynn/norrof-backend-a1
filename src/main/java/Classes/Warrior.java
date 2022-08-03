package Classes;

import Attributes.Attributes;
import Enums.ClassDamage;
import Enums.ClassType;
import User.Character;
import lombok.Getter;

public class Warrior extends Character {

   @Getter
   private final Attributes attributes;

    public Warrior(String name) {
        super(name);
        this.attributes = new Attributes(this, 5,2,1);
    }

    @Override
    public ClassDamage getClassDamage() {
        return ClassDamage.STRENGTH;
    }

    @Override
    public ClassType getClassType() {
        return ClassType.Warrior;
    }


    @Override
    public String toString() {
        return "----------------------- \n" +  " Name: " + super.name + "\n" + attributes;
    }
}
