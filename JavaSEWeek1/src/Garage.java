import java.util.ArrayList;
import java.util.List;

public class Garage {
    ArrayList<Vehicle> arrV = new ArrayList<>();

    private void addVehicle(Vehicle v) {
        arrV.add(v);
    }

    private void removeVehicleByType(String vType) {
        int foundIndex = 0;
        boolean notFound = true;
        while (notFound) {
            for (Vehicle v : arrV) {
                String s = v.getType();
                if (s.equals(vType)) {
                    notFound = false;
                    break;
                }
                else if(foundIndex < arrV.size()){
                    foundIndex++;
                }
            }

        }
        arrV.remove(foundIndex);
    }



//Remove car from garage by ID. Ids unique so only need to remove one.
private void removeVehicleByID(int vID) {
    int foundIndex = 0;
    boolean notFound = true;
    while (notFound) {
        for (Vehicle v : arrV) {
            int i = v.getvID();
            if (i == vID) {
                notFound = false;
                break;
            }
            else if(foundIndex < arrV.size()){
                foundIndex++;
            }
        }

    }
    arrV.remove(foundIndex);
}




    //Empty ArrayList of Vehicles
    private void emptyGarage(ArrayList<Vehicle> arrV) {
        arrV.clear();
    }


    private int fixAndCostVehicle(Vehicle v) {
        return v.getRepairCost();
    }


    public void printGarageContents(ArrayList<Vehicle> arrV) {
        for (Vehicle v : arrV) {
            System.out.println(v.toString());
        }
    }


    public static void main(String[] args) {
        //Initiate class
        Garage GA = new Garage();
        // Create Vehicles
        Vehicle v1 = new Car("Saloon", 34, 4, 2);
        Vehicle v2 = new Motorcycle("Sports", 45, 2, 2);
        Vehicle v3 = new Truck("Van", 348, 6, 1200);
        // STEP 1. Add to garage
        GA.addVehicle(v1);
        GA.addVehicle(v2);
        GA.addVehicle(v3);
        // STEP 2. Print Garage
        GA.printGarageContents(GA.arrV);
        System.out.println("");

//        //STEP 3. Remove by ID
        GA.removeVehicleByID(348);
        GA.printGarageContents(GA.arrV);
        System.out.println("");
        // STEP 4. Remove by Type
        GA.removeVehicleByType("Sports");
        GA.printGarageContents(GA.arrV);
        System.out.println("");
        // STEP 4. Empty garage and check
        GA.emptyGarage(GA.arrV);

        // Find cost of repair associated with the vehicle.
        System.out.println("Vehicle Fixed. Total Cost:£" + GA.fixAndCostVehicle(v3));
    }
}
