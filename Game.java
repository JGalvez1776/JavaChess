import java.util.List;

public class Game {
    private List<Player> players;
    private int activePlayerNum;
    private Board board;



    public Game(Board board) {
        this.board = board;
        this.players = Player.getPlayers();
        activePlayerNum = -1;
        
    }

    /**
     * @return Next active player
     */
    public Player nextPlayer() {
        activePlayerNum++;
        if (activePlayerNum > players.size() - 1) {
            activePlayerNum = 0;
        }
        return players.get(activePlayerNum);
    }

    public void printBoard() {
        System.out.println(board);
    }

    public String toString() {
        return players.toString();
    }

} 