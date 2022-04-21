public class Main{
    public static void main(String[] args) {
        ArcherTower arcTower1 = new ArcherTower(50, 400, "Elixir", "ArcherTower1");
        Giant giant1 = new Giant(320, 55, "giant1");
        giant1.moveForward();


        for(int i=1; i<=8; i++){
            System.out.println("");
            giant1.attackBuilding(arcTower1);
            arcTower1.attackTarget(giant1);
    
            arcTower1.info();
            giant1.info();
        }
    }
}