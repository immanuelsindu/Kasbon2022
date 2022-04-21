public interface Troops {
    public void attackBuilding(Building building);
    public void moveForward();
    
    public void adjustHPTroops(double HP, double attackPower);
    public double getHPTroops();
    public String get_TROOP_Name();
    public String get_TROOP_Status();
}