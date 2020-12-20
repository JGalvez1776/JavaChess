

public class StandardBoard extends Board {


    public StandardBoard() {
        super(8, 8);
        new Player("White");
        new Player("Black");
        
    }

    @Override
    protected void populateBoard() {
        

    }


}