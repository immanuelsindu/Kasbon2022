public class Dragon implements Troops {
    private double HP;
    private double attackPower;
    private String status;
    private String troopName;

    public Dragon(double HP, double attackPower, String troopName){
        this.HP = HP;
        this.attackPower = attackPower;
        this.troopName = troopName;
        this.status = "Alive";
    }


    @Override
    public String get_TROOP_Name() {
        return this.getTroopName();
    }


    @Override
    public void adjustHPTroops(double HP, double attackPower) {
        if(this.getStatus().equalsIgnoreCase("Alive")){
            this.setHP(this.getHP() - attackPower);
            if(this.getHP() < 0 ){
                this.setStatus("Dead");
                this.HP = 0;
                System.out.println("===================");
                System.out.println(this.get_TROOP_Name() + " sudah mati");
                System.out.println("===================");
            }
        }else{
            System.out.println(this.getTroopName() + " sudah mati");
        }
    }
    
    @Override
    public void attackBuilding(Building building) {
        if(building.get_BUILDING_status().equalsIgnoreCase("unBroken")){
            if(this.getStatus().equalsIgnoreCase("Alive")){
                System.out.println(this.get_TROOP_Name() + " menyerang Area Target "+ building.get_BUILDING_name());
                building.adjust_Building_HP(building.get_BUILDING_HP(), this.getAttackPower());
            }else{
                System.out.println("===================");
                System.out.println(this.get_TROOP_Name() + " sudah mati");
                System.out.println("===================");
            }
          
        }else{
            System.out.println(building.get_BUILDING_name() + " sudah hancur Gan");
        }
        
    }

    @Override
    public void moveForward() {
        System.out.println(this.getTroopName() + " maju kedepan terbang di udara");
    }

    @Override
    public String get_TROOP_Status() {
        return this.getStatus();
    }

    @Override
    public double getHPTroops() {
        return this.getHP();
    }

    public void info(){
        System.out.println("\n"+this.getTroopName()+"\nStatus = "+this.getStatus()+"\nHP = "+this.getHP());
    }

//    ============================================================================
    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double hP) {
        this.HP = hP;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTroopName() {
        return troopName;
    }

    public void setTroopName(String troopName) {
        this.troopName = troopName;
    }
}
