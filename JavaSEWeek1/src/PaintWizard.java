import javafx.util.Pair;

import java.util.HashMap;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Map;

public class PaintWizard {
    private ArrayList<Paints> paintList = new ArrayList<Paints>();
//    private ArrayList<double> finalCoverage = new ArrayList<double>();
    private ArrayList<Pair> paintAndFullTins = new ArrayList<Pair>();

    //Pick cheapest paint calculated to cover roomsize entered and return the details to the user via toString method.
    public Paints findCheapest() {
        Paints cheapestPaint = null;
        double cost = 0;
        for (int i = 0; i < paintAndFullTins.size(); i++) {
            Paints p = (Paints) paintAndFullTins.get(i).getKey();
            double newCost = (double) paintAndFullTins.get(i).getValue();
            if (cost == 0) {
                cheapestPaint = p;
                cost = newCost;
            } else {
                if(newCost < cost){
                    cheapestPaint = p;
                }
            }
        }
        return cheapestPaint;
    }


    private Paints calculateWaste() {
        return null;
    }

    private void calculateCoverage(double cpl) {

    }

    private void amountOfTinsRequired(double roomSize) {
        for (Paints p : paintList) {
            double tins = roomSize / p.getCoverage();
            double fullTins = Math.ceil(tins);
            double cost = fullTins * p.getPrice();
            paintAndFullTins.add(new Pair<>(p, cost));
        }
    }

    public Paints findLeastWasteful() {
        return null;
    }

    private void showPaintList() {
        for (Paints p : paintList) {
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        PaintWizard pWizard = new PaintWizard();

        Paints p1 = new Paints("CheapoMax", 20, 19.99, 10);
        Paints p2 = new Paints("AverageJoes", 15, 17.99, 11);
        Paints p3 = new Paints("DuluxourousPaints", 10, 25.00, 20);

        pWizard.paintList.add(p1);
        pWizard.paintList.add(p2);
        pWizard.paintList.add(p3);

        pWizard.showPaintList();
        pWizard.amountOfTinsRequired(4500.00);
        System.out.println(" ");
        System.out.println(pWizard.findCheapest());

        //Takes roomSize. Method can access array from above.
//

//        //Take paintList array above. Returns
//        pWizard.findLeastWasteful();
//        //Just show prints
//

    }

}