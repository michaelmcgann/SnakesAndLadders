import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player currentPlayer;
    private boolean gameEnded;

    public List<Player> getPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Game() {
        board = new Board();
        players = new ArrayList<>();
        gameEnded = false;
    }

    public void addPlayer(Player player) {
        players.add(player);
        if (currentPlayer == null) {
            currentPlayer = player;
        }
    }

    public void playTurn(int roll) {
        if (gameEnded) {
            return;
        }

        board.movePlayer(currentPlayer, roll);
        if (board.checkIfWon(currentPlayer.getPosition())) {
            gameEnded = true;
        }

        int currentPlayerIndex = players.indexOf(currentPlayer);
        currentPlayer = players.get((currentPlayerIndex + 1) % players.size());
    }

}
