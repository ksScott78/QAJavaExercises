package GameClasses;

import java.util.Scanner;

public class PlayTheGame {

    public static boolean isActive = true;

    public PlayTheGame(Player p, PlayerMap pm) {
    }

    Scanner sc = new Scanner(System.in);

    // Enter a direction and return the direction from the Hashmap to the correct description of what is there.
    public String goDirection(String movement, Player p, PlayerMap pm) {
        int countDir = 0;
        p.addPreviousState(movement);
        for (String s : p.getPreviousStates()) {
            if (s.equalsIgnoreCase(movement)) {
                countDir++;
            }
        }
        //Reduce goal by 10m every direction step.
        //Create four end goals depending on previous steps used by the player.
        p.setWatchMeters(10);
        if ((movement.equals("north")) && (countDir <= 3)) {
            if (countDir == 3) {
                isActive = false;
            }
            return pm.gameInstructions.get(countDir);
        }
        if ((movement.equals("east")) && (countDir <= 3)) {
            if (countDir == 3) {
                isActive = false;
            }
            return pm.gameInstructions.get(countDir + 3);
        }
        if ((movement.equals("south")) && (countDir <= 3)) {

            isActive = false;
            return pm.gameInstructions.get(countDir + 6);
        }
        if ((movement.equals("west")) && (countDir <= 3)) {
            if (countDir == 3) {
                isActive = false;
            }
            return pm.gameInstructions.get(countDir + 9);
        } else return lostError();
    }

    //Return on end of path. When all moves have been used 3 times.
    public String lostError() {
        String error = "You try to, but the way is blocked";
        return error;
    }

    //Return on non valid input.
    public String inputError() {
        String error = "Not a valid direction. Please Enter north, east, south or west";
        return error;
    }

    // Intialise Variable and start game
    public static void main(String[] args) {
        Player p = new Player();
        PlayerMap pm = new PlayerMap();

        PlayTheGame game = new PlayTheGame(p, pm);

        pm.start();

        System.out.println("Hello and welcome to Barron Moore");
        System.out.println("Enter a direction to start your journey.");

        String s;

        try {
            do {
                s = game.sc.nextLine();
                if (s.equalsIgnoreCase("north")) {
                    System.out.println(game.goDirection(s, p, pm));
                } else if (s.equalsIgnoreCase("east")) {
                    System.out.println(game.goDirection(s, p, pm));
                } else if (s.equalsIgnoreCase("south")) {
                    System.out.println(game.goDirection(s, p, pm));
                } else if (s.equalsIgnoreCase("west")) {
                    System.out.println(game.goDirection(s, p, pm));
                } else {
                    System.out.println(game.inputError());
                }
            }
            while ((!(s.equalsIgnoreCase("exit"))) && (isActive));
            game.sc.close();
        } catch (IllegalStateException isx) {
            System.out.println("something wrong here");
        }
    }
}