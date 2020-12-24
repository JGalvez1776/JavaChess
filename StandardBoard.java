
public class StandardBoard extends Board {


    public StandardBoard() {
        super(8, 8);
        populateBoard();
        
    }

    @Override
    protected void populateBoard() {
        Player white = new Player("White");
        Player black = new Player("Black");
        populateSide(white, 0, 1);
        populateSide(black, 7, 6);
    }

    private void populateSide(Player player, int kingRow, int pawnRow) {
        place(new Rook(player), new Move(0, kingRow));
        place(new Knight(player), new Move(1, kingRow));
        place(new Bishop(player), new Move(2, kingRow));
        place(new Queen(player), new Move(3, kingRow));
        place(new King(player), new Move(4, kingRow));
        place(new Bishop(player), new Move(5, kingRow));
        place(new Knight(player), new Move(6, kingRow));
        place(new Rook(player), new Move(7, kingRow));
        for (int i = 0; i < 8; i++) {
            place(new Pawn(player), new Move(i, pawnRow));
        }
    }


}