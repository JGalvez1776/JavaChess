public class Move {
    private int x;
    private int y;
    private static int boardHeight = 7;

    public Move() {
        this(0, 0);
    }

    public Move(int x, int y) {
        this.x = x;
        this.y = boardHeight - y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Use this is the board height is not 8. 
     */
    public static void alignToBoard(Board board) {
        boardHeight = board.getHeight() - 1;
    }

}