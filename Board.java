
public abstract class Board {
    private int width;
    private int height;
    private Piece[][] board;
    private String rowString;
    private String bottomRowString;

    public abstract void populateBoard();

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new Piece[height][width];

        /* TODO: Make this hidden using a private method */
        this.rowString = "-----".repeat(width) + "-\n";
        Move.alignToBoard(this);
    }

    public Board() {
        this(8, 8);
    }
    public Board(int dimension) {
        this(dimension, dimension);
    }

    protected void place(Piece piece, Move move) {
        // TODO: Implement a check here to make sure it is being placed on the board.
        board[move.getY()][move.getX()] = piece;
    }

    public String toString() {
        StringBuffer string = new StringBuffer();
        for (Piece[] row : board) {
            string.append(rowString);
            for (Piece piece : row) {
                if (piece == null) {
                    string.append("|    ");
                } else {
                    string.append("|");
                    string.append(piece);
                } 
                
            }
            string.append("|\n");
        }
        string.append(rowString);
        return string.toString();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
}