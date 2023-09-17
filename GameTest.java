import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testAddPlayers() {
        Player player1 = new Player("Mike");
        Player player2 = new Player("Tommy");
        game.addPlayer(player1);
        game.addPlayer(player2);
        List<Player> players = game.getPlayers();
        Player playerFromList1 = players.get(0);
        Player playerFromList2 = players.get(1);
        assertEquals(playerFromList1.getName(), "Mike");
        assertEquals(playerFromList2.getName(), "Tommy");
    }

    @Test
    public void testGetCurrentPlayer() {
        Player player = new Player("Mike");
        game.addPlayer(player);
        assertEquals(player, game.getCurrentPlayer());
    }

    @Test
    public void testPlayBasicTurn() {
        Player player = new Player("Mike");
        Dice dice = new Dice();
        int roll = dice.rollDice();
        game.addPlayer(player);
        game.playTurn(roll);
        assertEquals(roll + 1, player.getPosition());
    }
}
