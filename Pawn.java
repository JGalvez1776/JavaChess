public class Pawn extends Piece {

    public Pawn(Player team) {
        super(team);
    }

    public void findMoves(Board board) {



    }

    public boolean checkMove(Board board, Move move) {

        return false;
    }
    
    private void promote() {

    }  

    public String toString() {
        return "Pawn";
    }

}