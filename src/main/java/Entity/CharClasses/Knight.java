package Entity.CharClasses;

import Entity.Enemy;
import Entity.StrengthCharacter;
import Inventory.ToolType;
import Inventory.Treasure;
import Room.FightingRoom;

import java.util.ArrayList;

public class Knight extends StrengthCharacter {
    public Knight(int healthPoints, ToolType toolType) {
        super(healthPoints, ToolType.WOODENSWORD);
    }

//    public void physicalFight(FightingRoom fightingRoom){
//        for(Enemy enemy : fightingRoom.getEnemies()){
//            int newHealthPoints = enemy.getHealthPoints() - this.toolType.getDamagePoints();
//            enemy.setHealthPoints(newHealthPoints);
//        }
//        int enemyDamagePointsInRoom = 0;
//        for(Enemy enemy : fightingRoom.getEnemies()){
//            enemyDamagePointsInRoom += enemy.getToolType().getDamagePoints();
//        }
//        int newCharacterHealthPoints = this.getHealthPoints() - enemyDamagePointsInRoom;
//        this.setHealthPoints(newCharacterHealthPoints);
//    }

}
