package Room;

import Inventory.Treasure;

import java.util.ArrayList;

public class TreasureRoom {
    private ArrayList<Treasure> treasures;
    public TreasureRoom(){

        this.treasures = new ArrayList<Treasure>();
    }

    public ArrayList<Treasure> getTreasures(){
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }
    public void addTreasureToRoom(Treasure treasure){
        treasures.add(treasure);
    }

    public void emptyTreasureRoom(){
        treasures.clear();
    }
}
