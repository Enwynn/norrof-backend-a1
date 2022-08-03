package Items;

import lombok.Getter;
import lombok.Setter;

public class Item {
    @Getter
    protected String name;
    @Getter
    private final int REQUIRED_LEVEL;

    @Getter @Setter
    private final int slot = 0;

    public Item(int required_level, String name) {
        REQUIRED_LEVEL = required_level;
        this.name = name;
    }
}
