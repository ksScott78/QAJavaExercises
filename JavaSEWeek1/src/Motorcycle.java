public class Motorcycle extends Vehicle {

    private int repairCost = 100;

    private int engineSize;

    public Motorcycle(String type, int vID, int numOfWheels, int engineSize) {
        this.numOfWheels = numOfWheels;
        this.vID = vID;
        this.engineSize = engineSize;
        this.type = type;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public String toString() {
        return "Type: " + this.type + "   vID: " + this.vID + "   Number of Wheels: " + this.numOfWheels + "   Repair Cost: " + this.repairCost + "   Engine Size: " + this.engineSize;
    }


}
