import java.util.HashSet;

public abstract class Piece {
    private HashSet<Move> moves;
    private Player team;
    

    public Piece(Player team) {
        this.team = team;
        this.moves = new HashSet<Move>();
    }

    /*TODO: Implement move function. Should be the same may implement in the board? */

    public abstract void findMoves(Board board);

    public abstract boolean checkMove(Board board, Move move);
    
    public boolean isValid(Move move) {
        return moves.contains(move);
    }

    public void clearMove() {
        moves = new HashSet<Move>();
    }

    public void addMove(Move move) {
        moves.add(move);
    }


}