public class Truck extends Vehicle {

    private int repairCost = 600;

    private int maxWeight;


    public Truck(String type, int vID, int numOfWheels, int maxWeight) {
        this.numOfWheels = numOfWheels;
        this.vID = vID;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public String toString() {
        return "Type: " + this.type + " vID: " + this.vID + " Number of Wheels: " + this.numOfWheels + " Repair Cost: " + this.repairCost + " Maximum Vehicle Weight: " + this.maxWeight;
    }
}



