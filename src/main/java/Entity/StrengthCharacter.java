package Entity;

import Interfaces.IStrength;
import Inventory.ToolType;
import Inventory.Treasure;
import Room.FightingRoom;

import java.util.ArrayList;

public abstract class StrengthCharacter extends Entity {
    private ToolType toolType;

    public StrengthCharacter(int healthPoints, ToolType toolType) {
        super(healthPoints);
        this.toolType = toolType;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public void physicalFight(FightingRoom fightingRoom){
        for(Enemy enemy : fightingRoom.getEnemies()){
            int newHealthPoints = enemy.getHealthPoints() - this.toolType.getDamagePoints();
            enemy.setHealthPoints(newHealthPoints);
        }
        int enemyDamagePointsInRoom = 0;
        for(Enemy enemy : fightingRoom.getEnemies()){
            enemyDamagePointsInRoom += enemy.getToolType().getDamagePoints();
        }
        int newCharacterHealthPoints = this.getHealthPoints() - enemyDamagePointsInRoom;
        this.setHealthPoints(newCharacterHealthPoints);
    }
}
