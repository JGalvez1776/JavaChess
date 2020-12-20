import java.util.HashSet;

public abstract class Piece {
    private HashSet<Move> moves;
    private Team team;
    

    public Piece(Team team) {
        this.team = team;
        this.moves = new HashSet<Move>();
    }

    /*TODO: Implement move function. Should be the same may implement in the board? */

    public abstract void findMoves(Board board);

    public abstract boolean checkMove(Board board, Move move);
    
    public boolean isValid(Move move) {
        return moves.contains(move);
    }

    private void clearMove() {
        moves = new HashSet<Move>();
    }

    private void addMove(Move move) {
        moves.add(move);
    }


}