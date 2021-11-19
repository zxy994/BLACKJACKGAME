import java.util.List;

public class BlackJackGame {
    public static void Strategy(Player player) {
        if(player.getTotalValueOfCardsInHand() < 17){
            // setting status of player
            player.setStatus("Hit");
            BlackJackMaster.playerStatuses.add(player.getStatus());
        } else if (player.getTotalValueOfCardsInHand() > 17){
            player.setStatus("Stick");
            BlackJackMaster.playerStatuses.add(player.getStatus());
        } else if(player.getTotalValueOfCardsInHand() > 21){
            player.setStatus("GoBust");
            BlackJackMaster.playerStatuses.add(player.getStatus());
        } else if(player.getTotalValueOfCardsInHand() == 21){
            player.setStatus("Won");
            BlackJackMaster.playerStatuses.add(player.getStatus());
        }
    }

    // multiplay method for game
    public static void beginGame(List<Player> players, Deck deck) {
        int playerIdentity = 1 ;

        for (Player player : players) {
            Strategy(player);
            // checking player status to mk decision
            switch (player.getStatus()) {
                case "Hit" -> {
                    System.out.println("Will Hit you a card player :) " +playerIdentity);
                    deck.dealACardIfHit(player);
                }

                case "Stick" -> System.out.println("You must Stick Player :) " +playerIdentity);

                case "GoBust" -> players.remove(player);

                case "Won" -> System.out.println("You won... Player :) " +playerIdentity);
            }
            playerIdentity++ ;
        }
    }
}
