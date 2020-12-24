public class King extends Piece {

    public King(Player team) {
        super(team);
    }

    public void findMoves(Board board) {

    }

    public boolean checkMove(Board board, Move move) {
        return false;
    }

    public String toString() {
        return "King";
    }


}