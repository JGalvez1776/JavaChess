import java.util.HashMap;
import java.util.HashSet;

public class Team {
    private int id;
    private static HashMap<Integer, String> teamIDs;
    private HashSet<Piece> pieces;

    
    public Team(int id) {
        if (!teamIDs.containsKey(id)) {
            throw new IllegalArgumentException("Teams not logged require a team name.");
        }
        // TODO: Create a new player of this team. Only useful for multiplayer?
    }

    public Team(int id, String teamName) {
        this.id = id;
        this.pieces = new HashSet<Piece>();
    }


    
}