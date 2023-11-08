package Entity;

import java.util.ArrayList;
import Inventory.Treasure;
import Room.TreasureRoom;

import static java.lang.System.in;


public abstract class Entity {
    private int healthPoints;
    private ArrayList<Treasure> treasures;

    public Entity(int healthPoints) {
        this.healthPoints = healthPoints;
        this.treasures = new ArrayList<Treasure>();

    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public void enterTreasureRoom(TreasureRoom treasureRoom){
        System.out.println("You have entered a treasure room, containing: ");
        for(Treasure item : treasureRoom.getTreasures()){
            System.out.println(item.getLoot());
        }
    }

    public void pickUpTreasure(TreasureRoom treasureRoom) {
        for (Treasure item : treasureRoom.getTreasures()) {
            treasures.add(item);
        }
        treasureRoom.emptyTreasureRoom();
    }
}
