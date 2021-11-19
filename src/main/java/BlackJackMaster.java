import java.util.*;

//blackjackMaster controls the game
public class BlackJackMaster {
    Scanner scanner = new Scanner(System.in);
    static Integer numOfPlayers;
    static List<Player> playerList = new ArrayList<>();
    static List<String> playerStatuses = new ArrayList<>();

    public void masterIsSpeaking() {
        System.out.println("YOU DARED TO PLAY BLACKJACK");
        System.out.println("-------------------------------");
        System.out.print("Enter number of players : ");
        numOfPlayers = scanner.nextInt();

        Deck deck = new Deck();
        deck.newDeck();
        deck.shuffleDeck();

        //creating players and assigning them their initial two cards
        for (int i = 1; i <= numOfPlayers; i++) {
            playerList.add(new Player(deck.dealCardAtStartGame()));
        }

        //before we deal first two cards
        deck.dealCardAtStartGame();

        // begin game
        BlackJackGame.beginGame(playerList, deck);

        // checking game rules
        if (EndGameRules.allPlayersStick(playerStatuses, numOfPlayers)) {
            System.out.println("Game Ended :: All Players Stick");
        }
        else if(EndGameRules.playerHits21(playerList) || EndGameRules.onePlayerRemaining(playerList)) {
            System.out.println("Game Ended :: Player "+EndGameRules.getWinner()+" Won");
        }
        else {
            // run the for loop
        }

    }














//    //variable to hold playerOne card value
     List <Integer> playerValue;
//
//    //getting the total of each value
//    //b as an interator variable
//    Integer b = 0;
//
    public List<Integer> getEachPLayersValue() {
        for (Player player: playerList) {
            playerValue.add(player.getTotalValueOfCardsInHand()) ;
        }

//
//        for(int i = 0; i < playerList.size(); i++) {
//            Player player = playerList.get(i);
//            List<Card> playerCards = player.getCardsInHand();
//            Card firstCardOfPlayer = playerCards.get(b);
//            Card secondCardOfPlayer = playerCards.get(++b);
//            playerValue.add(firstCardOfPlayer.getRankValue()
//                            +secondCardOfPlayer.getRankValue());
//
//            b = 0;
//        }
       return playerValue ;
    }

















}

