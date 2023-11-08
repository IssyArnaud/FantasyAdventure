import Entity.CharClasses.Knight;
import Entity.Enemy;
import Inventory.ToolType;
import Inventory.Treasure;
import Room.FightingRoom;
import Room.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MasterTest{
    //============TREASURES=============
    Treasure goblet;
    Treasure crown;
    //============ENEMIES=============
    Enemy goblin;
    ArrayList<Treasure> goblinTreasures;

    //============CHARACTERS=============
    Knight knight;
    ArrayList<Treasure> knightTreasures;

    //============ROOMS=============
    TreasureRoom treasureRoom1;
    ArrayList<Treasure> treasureRoomTreasures;


    FightingRoom fightingRoom1;
    ArrayList<Enemy> fightRoomEnemies;

    //============TREASURES=============
    //============TREASURES=============


//    public class MasterTest(Treasure goblet, Treasure crown, Enemy goblin, Knight knight, TreasureRoom treasureRoom1, FightingRoom fightingRoom1) {
//        this.goblet = goblet;
//        this.crown = crown;
//
//        ArrayList<Treasure> goblinTreasures = new ArrayList<>();
//        goblinTreasures.add(crown);
//        this.goblin = goblin;
//
//        this.knight = knight;
//        ArrayList<Treasure> knightTreasures = new ArrayList<>();
//
//        this.treasureRoom1 = treasureRoom1;
//        ArrayList<Treasure> treasureRoomTreasures = new ArrayList<>();
//        treasureRoomTreasures.add(goblet);


//        this.fightingRoom1 = fightingRoom1;
//        ArrayList<Enemy> fightRoomEnemies = new ArrayList<>();
//
//    }

    @Before
    public void before(){
        goblet = new Treasure("golden goblet");
        crown = new Treasure("golden crown");
        goblin = new Enemy(10, ToolType.FIST);
        knight = new Knight(15, ToolType.WOODENSWORD);
        treasureRoom1 = new TreasureRoom();
        treasureRoom1.addTreasureToRoom(goblet);
        fightingRoom1 = new FightingRoom(fightRoomEnemies);
    }

    @Test
    public void sUPERADVENTURE(){
        knight.enterTreasureRoom(treasureRoom1);

        assertEquals(0, knight.getTreasures().size());
        assertEquals(1, treasureRoom1.getTreasures().size());

        knight.pickUpTreasure(treasureRoom1);

        assertEquals(0, treasureRoom1.getTreasures().size());
        assertEquals(1, knight.getTreasures().size());
    }




}

