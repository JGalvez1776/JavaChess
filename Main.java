public class Main {
    public static void main(String[] args) {
        StandardBoard board = new StandardBoard();

        Game game = new Game(board);

        game.printBoard();
        System.out.println(game);

    }
}