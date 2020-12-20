public class Main {
    public static void main(String[] args) {
        StandardBoard board = new StandardBoard();
        System.out.println(board);


        Team white = new Team("White");
        board.place(new Pawn(white), new Move(4, 4));
        System.out.println(board);


    }
}