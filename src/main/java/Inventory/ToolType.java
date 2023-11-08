package Inventory;



public enum ToolType {
    WOODENSWORD(10, 0),
    FIST(1, 0),
    SPIKEMACE(8 ,0),
    HEALINGSCROLL(0 ,10),
    FIREBALL(10 ,0);


    private final int damagePoints;
    private final int healingPoints;

    ToolType(int damagePoints, int healingPoints){
        this.damagePoints = damagePoints;
        this.healingPoints = healingPoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public int getHealingPoints() {
        return healingPoints;
    }
}
