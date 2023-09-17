import java.util.Random;

public class Dice {
    private static final Random rand = new Random();

    public int rollDice() {
        return rand.nextInt(6) + 1;
    }
}
