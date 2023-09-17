import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTest {
    private Board board;
    private Player player1;

    @BeforeEach
    public void setUp() {
        player1 = new Player("Mike");
        board = new Board();
    }

    @Test
    public void testGetMaxPosition() {
        assertEquals(100, board.getMaxPosition());
    }

    @Test
    public void testIfOnSnake() {
        player1.setPosition(8);
        board.movePlayer(player1, 1);
        assertEquals(3, player1.getPosition());
    }

    @Test
    public void testIfOnLadder() {
        player1.setPosition(3);
        board.movePlayer(player1, 2);
        assertEquals(15, player1.getPosition());
    }

    @Test
    public void testIllegalMove() {
        player1.setPosition(99);
        board.movePlayer(player1, 2);
        assertEquals(99, player1.getPosition());
    }

    @Test
    public void testIllegalMove2() {
        player1.setPosition(95);
        board.movePlayer(player1, 6);
        assertEquals(95, player1.getPosition());
    }

    @Test
    public void testIfWinner() {
        player1.setPosition(96);
        board.movePlayer(player1, 4);
        assertTrue(board.checkIfWon(player1.getPosition()));
    }
}
