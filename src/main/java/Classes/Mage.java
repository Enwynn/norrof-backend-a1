package Classes;

import Attributes.Attributes;
import Enums.ClassDamage;
import Enums.ClassType;
import User.Character;

public class Mage extends Character {

    private final Attributes attributes;

    public Mage(String name) {
        super(name);
        this.attributes = new Attributes(this,1,1,8);
    }
    @Override
    public ClassDamage getClassDamage() {
        return ClassDamage.INTELLIGENCE;
    }

    @Override
    public ClassType getClassType() {
        return ClassType.Mage;
    }

    public void getBaseDamage() {

    }
}
