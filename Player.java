import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Player {
    private static List<Player> players = new ArrayList<Player>();
    private String name;
    private HashSet<Piece> pieces;

    public Player(String teamName) {
        /* TODO: Put a check to see if there is a duplicate team name? */
        this.name = teamName;
        this.pieces = new HashSet<Piece>();
        players.add(this);
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public void removePiece(Piece piece) {
        pieces.remove(piece);
    }

    public static List<Player> getPlayers() {
        return players;
    }

    public String toString() {
        return name;
    }

    
}