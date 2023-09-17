public class Board {
    private final int MAX_POSITION = 100;


    public Board() {
    }

    public int getMaxPosition() {
        return this.MAX_POSITION;
    }

    public void movePlayer(Player player, int steps) {
        player.move(steps);

        int position = player.getPosition();
        if (checkLegitMove(position)) {
            int newPosition = getNewPositionIfOnSnakeOrLadder(position);
            player.setPosition(newPosition);
        } else {
            position -= steps;
            player.setPosition(position);
        }
    }

    public int getNewPositionIfOnSnakeOrLadder(int position) {

        return switch (position) {
            case 5 -> 15;
            case 33 -> 40;
            case 60 -> 68;
            case 80 -> 91;
            case 9 -> 3;
            case 29 -> 20;
            case 55 -> 26;
            case 92 -> 80;
            case 95 -> 31;
            default -> position;
        };
    }

    public boolean checkLegitMove(int position) {
        return position <= MAX_POSITION;
    }

    public boolean checkIfWon(int position) {
        return position == MAX_POSITION;
    }
}
