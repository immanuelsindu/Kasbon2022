public class Main{
    public static void main(String[] args) {
        ArcherTower arcTower1 = new ArcherTower(50, 400, "Elixir", "ArcherTower1");
        Giant giant1 = new Giant(320, 55, "Giant1");
        // giant1.moveForward();


        for(int i=1; i<=8; i++){
            System.out.println("\n===== Serangan ke "+i+" ==========================================");
            giant1.attackBuilding(arcTower1);
            arcTower1.attackTarget(giant1);
    
            arcTower1.info();
            giant1.info();
        }

        System.out.println("");
        WizzardTower wizzTower1= new WizzardTower(35, 430, "Dark Elixir", "WizzardTower1");
        Dragon dragon1 = new Dragon(520, 80, "Dragon1");
        dragon1.moveForward();

        for(int i=1; i<=8; i++){
            System.out.println("\n===== Serangan ke "+i+" ==========================================");
            dragon1.attackBuilding(wizzTower1);
            wizzTower1.attackTarget(dragon1);
    
            wizzTower1.info();
            dragon1.info();
        }
    }
}