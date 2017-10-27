package GameClasses;

import java.util.ArrayList;

public class Player {
    private int watchMeters;
    private ArrayList<String> previousStates;


    public Player(){
        this.watchMeters = 50;
        this.previousStates = new ArrayList<String>();
    }

    public void setWatchMeters(int dis){
        this.watchMeters = watchMeters - dis;
    }

    public int getWatchMeters(){
        return watchMeters;
    }

    public ArrayList<String> getPreviousStates() {
        return previousStates;
    }

    public void addPreviousState(String movement){
        previousStates.add(movement);
    }
}
