package Entity;

import Inventory.ToolType;
import Inventory.Treasure;

import java.util.ArrayList;

public class ClericCharacter extends Entity{
    private ToolType toolType;

    public ClericCharacter(int healthPoints, ToolType toolType) {
        super(healthPoints);
        this.toolType = toolType;
    }
}
