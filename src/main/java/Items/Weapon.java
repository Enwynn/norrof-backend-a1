package Items;


import lombok.Getter;

public class Weapon extends Item {

    @Getter
    private double damage;

    @Getter
    private double attackSpeed;

    public Weapon(int required_level, String name) {
        super(required_level, name);
    }
}
