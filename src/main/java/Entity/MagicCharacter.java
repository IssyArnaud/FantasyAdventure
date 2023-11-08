package Entity;

import Inventory.ToolType;
import Inventory.Treasure;

import java.util.ArrayList;

public class MagicCharacter extends Entity {
    private ToolType toolType;

    public MagicCharacter(int healthPoints, ToolType toolType) {
        super(healthPoints);
    }
}
