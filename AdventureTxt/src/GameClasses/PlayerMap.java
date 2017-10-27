package GameClasses;

import java.util.HashMap;

public class PlayerMap {
  public HashMap <Integer, String> gameInstructions = new HashMap<>();



    private void populateMap()
    {
        //Based on directions the player gives return these
        //North Directions
        gameInstructions.put(1, "You head along a misty path and come to a clearing.");
        gameInstructions.put(2, "You head further in and come across a split path.");
        gameInstructions.put(3, "A demon has appeared. He devours your soul. You are dead.");


        //East Directions
        gameInstructions.put(4, "You head east a strange fod surrounds you.Which way do you go?");
        gameInstructions.put(5, "You come upon a small house. But it is locked. A demon is approaching.");
        gameInstructions.put(6, "You slay the demon following you.");



        //South Directions
        //Die as demon is following you as soon as you start the game
        gameInstructions.put(7, "A demon has appeared. He devours your soul. You are dead.");
        gameInstructions.put(8, "A demon has appeared. He devours your soul. You are dead.");
        gameInstructions.put(9, "A demon has appeared. He devours your soul. You are dead.");



        //West Directions
        gameInstructions.put(10, "You find a deserted crossroads. It looks dangerous to stay here.");
        gameInstructions.put(11, "You encounter a lack of imagination when thinking of situations to put in here");
        gameInstructions.put(12, "You discovered the pot of gold and the only 'good' ending in this game");

    }

    public void start() {
        populateMap();
    }
}

