public class Car extends Vehicle {


    private int repairCost = 200;
    private int numDoors;

    public Car(String type, int vID, int numWheels, int numDoors) {
        this.numOfWheels = numWheels;
        this.vID = vID;
        this.type = type;
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public String toString() {
        return "Type: " + this.getType() + "   vID: " + this.getvID() + "   Number of Wheels: " + this.getNumWheels() + "    Repair Cost: " + this.repairCost + "   Number of Doors: " + this.getNumDoors();
    }
}
