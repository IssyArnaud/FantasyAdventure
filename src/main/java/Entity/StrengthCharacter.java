package Entity;

import Inventory.ToolType;
import Inventory.Treasure;

import java.util.ArrayList;

public abstract class StrengthCharacter extends Entity {
    private ToolType toolType;

    public StrengthCharacter(int healthPoints, ToolType toolType) {
        super(healthPoints);
        this.toolType = toolType;
    }
}
