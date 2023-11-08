package Entity.CharClasses;

import Entity.StrengthCharacter;
import Inventory.ToolType;
import Inventory.Treasure;

import java.util.ArrayList;

public class Knight extends StrengthCharacter {
    public Knight(int healthPoints, ToolType toolType) {
        super(healthPoints, ToolType.WOODENSWORD);
    }
}
