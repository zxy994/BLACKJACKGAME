import java.util.List;

public class EndGameRules {
    // create winner
    private static Player winner = new Player();

    // Rule No. 1
    public static boolean allPlayersStick(List<String> playerStatuses, Integer numOfPlayers) {
        if (playerStatuses.stream().filter(x -> x == "Stick").count() == numOfPlayers)
            return  true;
        else
            return false;
    }

    // Rule No. 2
    public static boolean playerHits21 (List<Player> players){
        // variable to hold return value
        boolean response = false;

        for(Player player: players) {
            if (player.getTotalValueOfCardsInHand() == 21) {
                setWinner(player);
                // return true to the caller
                response = true;
                break;
            }
        }

        return response;
    }

    // Rule No. 3
    public static boolean onePlayerRemaining (List<Player> playerList){
        // variable to hold return value
        boolean response = false;

        if(playerList.size() == 1) {
            setWinner(playerList.get(0));
            response = true;
        }

        return response;
    }

    public static Player getWinner() {
        return winner;
    }

    public static void setWinner(Player winner) {
        EndGameRules.winner = winner;
    }
}