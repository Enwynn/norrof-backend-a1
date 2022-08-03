package Classes;

import Attributes.Attributes;
import Enums.ClassDamage;
import Enums.ClassType;
import User.Character;

public class Rogue extends Character {

    private final Attributes attributes;

    public Rogue(String name) {
        super(name);
        this.attributes = new Attributes(this, 2,6,1);
    }

    @Override
    public ClassDamage getClassDamage() {
        return ClassDamage.DEXTERITY;
    }

    @Override
    public ClassType getClassType() {
        return ClassType.Rogue;
    }
}
