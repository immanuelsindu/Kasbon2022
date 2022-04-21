public class ArcherTower implements Building {
    private double attackPower;
    private double HP;
    private String material;
    private String buildingName;
    private String status;

    public ArcherTower(double attackPower, double HP, String material, String buildingname){
        this.HP = HP;
        this.attackPower = attackPower;
        this.material = material;
        this.buildingName = buildingname;
        this.setStatus("unBroken");
        madeWith(getMaterial());
    }

    @Override
    public void attackTarget(Troops troops) {
        if(this.getStatus().equalsIgnoreCase("unBroken")){
            if(troops.get_TROOP_Status().equalsIgnoreCase("Alive")){
                System.out.println(this.getBuildingName() + " menyerang Single Target "+ troops.get_TROOP_Name());
                troops.adjustHPTroops(troops.getHPTroops(), this.getAttackPower());
            }else{
                System.out.println("===================");
                System.out.println(troops.get_TROOP_Name() + " sudah mati ");
                System.out.println("===================");
            }
        }else{
            System.out.println("===================");
            System.out.println(this.getBuildingName() + " sudah hancur");
            System.out.println("===================");
        }
    }

 
    @Override
    public String get_BUILDING_name() {
        // return  getBuildingName();
        return this.buildingName;
    }
   

    @Override
    public void madeWith(String material) {
        System.out.println(this.get_BUILDING_name() + " terbuat dari " + this.getMaterial());
    }

    @Override
    public String get_BUILDING_status() {
        return this.getStatus();
    }

    @Override
    public double get_BUILDING_HP() {
        return this.getHP();
    }

    
    @Override
    public void adjust_Building_HP(double hP, double attackPower) {
        if(getStatus().equalsIgnoreCase("unBroken")){
            this.HP = this.HP - attackPower;
            if(this.HP < 0 ){
                this.HP = 0 ;
                this.setStatus("Broken");
                System.out.println("===================");
                System.out.println(this.getBuildingName() + " sudah hancur");
                System.out.println("===================");
            }
        }else{
            System.out.println(this.getBuildingName() + " sudah ");
        }
    }

    public void info(){
        System.out.println("\n" +this.getBuildingName()+"\nStatus = "+this.getStatus()+"\nHP = "+this.getHP());
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

     
    public String getBuildingName() {
        return this.buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
