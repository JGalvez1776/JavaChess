import java.util.List;

public class Game {
    private List<Player> teams;
    private int activePlayerNum;


    public Game() {
        this.teams = Player.getTeams();
        activePlayerNum = -1;
    }

    public Player nextPlayer() {
        activePlayerNum++;
        if (activePlayerNum > teams.size() - 1) {
            activePlayerNum = 0;
        }
        return teams.get(activePlayerNum);
    }

} 