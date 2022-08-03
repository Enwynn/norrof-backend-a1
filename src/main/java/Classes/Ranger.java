package Classes;

import Attributes.Attributes;
import Enums.ClassDamage;
import Enums.ClassType;
import User.Character;

public class Ranger extends Character {

    private final Attributes attributes;

    public Ranger(String name){
        super(name);
        this.attributes = new Attributes(this, 1,7,1);
    }

    @Override
    public ClassDamage getClassDamage() {
        return ClassDamage.DEXTERITY;
    }

    @Override
    public ClassType getClassType() {
        return ClassType.Ranger;
    }
}
