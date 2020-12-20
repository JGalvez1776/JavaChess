import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Team {
    private static List<Team> teams = new ArrayList<Team>();
    
    private HashSet<Piece> pieces;

    public Team(String teamName) {
        /* TODO: Put a check to see if there is a duplicate team name? */
        this.pieces = new HashSet<Piece>();
        teams.add(this);
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public void removePiece(Piece piece) {
        pieces.remove(piece);
    }

    public static List<Team> getTeams() {
        return teams;
    }


    
}