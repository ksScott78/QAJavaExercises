package AdventureTxtTests;

import GameClasses.PlayerMap;
import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class PlayerMapTest {

    @Test
    public void testPopulateMap(){
        PlayerMap mp = new PlayerMap();
        HashMap testMap = new HashMap();
        testMap.put(1, "You head east a strange fod surrounds you.Which way do you go?");
        testMap.put(2, "You come upon a small house. But it is locked. A demon is approaching.");
        testMap.put(3, "You slay the demon following you.");
        assertEquals(testMap.size(), 3);
    }


}
