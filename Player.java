public class Player {
    private final String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 1;
    }

    public void setPosition(int newPosition) {
        this.position = newPosition;
    }

    public int getPosition() {
        return position;
    }

    public void move(int steps) {
        this.position += steps;
    }

    public String getName() {
        return this.name;
    }
}
