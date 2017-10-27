package AdventureTxtTests;

import GameClasses.Player;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    ArrayList<String> testStates = new ArrayList<String>();
    Player p = new Player();

    @Test
    public void testSetWatchMeters() {
        p.setWatchMeters(10);
        assertEquals(p.getWatchMeters(), 40);
    }


    @Test
    public void testGetPreviousStates() {
        testStates.add("north");
        testStates.add("south");
        testStates.add("west");
        assertEquals(testStates.size(), 3);
    }
}
