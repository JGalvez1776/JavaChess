import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Player {
    private static List<Player> teams = new ArrayList<Player>();
    private String name;
    private HashSet<Piece> pieces;

    public Player(String teamName) {
        /* TODO: Put a check to see if there is a duplicate team name? */
        this.name = teamName;
        this.pieces = new HashSet<Piece>();
        teams.add(this);
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public void removePiece(Piece piece) {
        pieces.remove(piece);
    }

    public static List<Player> getTeams() {
        return teams;
    }

    public String toString() {
        return name;
    }

    
}