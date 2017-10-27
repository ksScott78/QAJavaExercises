package AdventureTxtTests;

import GameClasses.PlayTheGame;
import GameClasses.Player;
import GameClasses.PlayerMap;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class PlayTheGameTest {

    Player p = new Player();
    PlayerMap pm = new PlayerMap();
    PlayTheGame game = new PlayTheGame(p, pm);


    @Test
    public void testCreation() {
        assertNotEquals(p, null);
        assertNotEquals(pm, null);
        assertNotEquals(game, null);
    }

    @Test
    public void testGoDirection() {
        pm.start();

        String s = game.goDirection("north", p, pm);

        assertEquals(s, pm.gameInstructions.get(1));
    }

    @Test
    public void testLostError() {
    }

    @Test
    public void testInputError() {
    }

}
