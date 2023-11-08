package Room;

import Entity.Enemy;

import java.util.ArrayList;

public class FightingRoom {
    private ArrayList<Enemy> enemies;
    public FightingRoom(ArrayList<Enemy> enemies){
        this.enemies = enemies;
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }
    public void addEnemyToRoom(Enemy enemy){
        enemies.add(enemy);
    }
}
