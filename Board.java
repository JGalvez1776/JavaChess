
public abstract class Board {
    private int width;
    private int height;
    private Piece[][] board;
    private String rowString;

    protected abstract void populateBoard();

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

    /**
     * Adds a piece to the board.
     * Note: To only be used in placing pieces initially and in public move method.
     */
    protected void place(Piece piece, int x, int y) {
        // TODO: Implement a check here to make sure it is being placed on the board.
        board[y][x] = piece;
    }

    protected void place(Piece piece, Move move) {
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