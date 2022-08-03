package Items;

import Enums.ArmorTypes;
import Enums.WeaponTypes;
import lombok.Getter;

import java.util.HashMap;

public class ItemHandler {
    @Getter
    private HashMap<WeaponTypes,Weapon> weapons = new HashMap<>();
    @Getter
    private HashMap<ArmorTypes,Armor> armor = new HashMap<>();

    public ItemHandler() {

        for (WeaponTypes e :WeaponTypes.values()) {
            weapons.put(e, null);
        }

        for (ArmorTypes e :ArmorTypes.values()) {
            armor.put(e, null);
        }
    }
}
