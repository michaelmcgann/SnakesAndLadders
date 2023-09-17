import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private Player mike;
    private Player tommy;

    @BeforeEach
    public void setUp() {
        mike = new Player("Mike");
        tommy = new Player("Tommy");
    }

    @Test
    public void testPlayerStart() {
        assertEquals("Mike", mike.getName());
        assertEquals(1, mike.getPosition());
    }

    @Test
    public void testTwoPlayerStart() {
        assertEquals("Mike", mike.getName());
        assertEquals(1, mike.getPosition());
        assertEquals("Tommy", tommy.getName());
        assertEquals(1, tommy.getPosition());
    }

    @Test
    public void testPlayerMoveForwardSixFromStart() {
        mike.move(6);
        assertEquals(7, mike.getPosition());
    }

    @Test
    public void testMultipleMovesWithTwoPlayersFromStart() {
        mike.move(5);
        tommy.move(3);
        assertEquals(6, mike.getPosition());
        assertEquals(4, tommy.getPosition());
    }

    @Test
    public void testMoveBackwardsFromSnake() {
        mike.setPosition(20);
        mike.move(-12);
        assertEquals(8, mike.getPosition());
    }
}
