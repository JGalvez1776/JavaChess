public class Board {
    private int width;
    private int height;
    private Board[][] board;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new Board[height][width];
    }

    public Board() {
        this(8, 8);
    }
    public Board(int dimension) {
        this(dimension, dimension);
    }

    public String toString() {
        StringBuffer string = new StringBuffer();
        for (Board[] row : board) {
            for (Board piece : row) {
                string.append(piece);
            }
            string.append("\n");
        }
        return string.toString();
    }
    




}