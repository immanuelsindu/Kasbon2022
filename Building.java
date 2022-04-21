public interface Building {
    public void madeWith(String material);
    public void attackTarget(Troops troop);
    
    public String get_BUILDING_name();
    public String get_BUILDING_status();
    public double get_BUILDING_HP();
    public void adjust_Building_HP(double thisHP, double attackPower);
}
