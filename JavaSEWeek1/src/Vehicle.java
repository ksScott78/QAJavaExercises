public abstract class Vehicle {

    public String type;
    public int numOfWheels;
    public int vID;

    public int getvID() {
        return vID;
    }

    public String getType() {
        return type;
    }

    public int getNumWheels() {
        return numOfWheels;
    }

    public abstract int getRepairCost();

    public abstract String toString();
}