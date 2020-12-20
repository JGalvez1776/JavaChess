import java.util.HashSet;
/* TODO: Remove this */
public class MoveSet {
    private HashSet<Move> moves;



    public MoveSet() {
        HashSet<Move> moves = new HashSet<Move>();
    }

    public void clearMoves() {
        moves = new HashSet<Move>();
    }   

    public void addMove(Move move) {
        moves.add(move);
    }

    public boolean contains(Move move) {
        return moves.contains(move);
    }



}