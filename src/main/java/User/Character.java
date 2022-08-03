package User;

import Attributes.Attributes;
import Enums.ClassDamage;
import Enums.ClassType;
import Items.Item;

import java.util.HashMap;

public abstract class Character {

  //  HashMap<Item, >


    protected final String name;

    private Attributes attributes;
    public Character(String name) {
        this.name = name;
    }
    public abstract ClassDamage getClassDamage();

    public abstract ClassType getClassType();
    @Override
    public String toString() {
        return super.toString();
    }
}
