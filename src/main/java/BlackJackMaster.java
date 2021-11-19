import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//blackjackMaster controls the game
public class BlackJackMaster {
    Scanner scanner = new Scanner(System.in);
    static Integer numOfPlayers;
    static List<Player> playerList = new ArrayList<>();

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
        //System.out.println("\n" + playerList);
        //before we deal first two cards
        deck.dealCardAtStartGame();
//        do {
//            if(player.getTotalValueOfCardsInHand() < 17){
//                System.out.println("You must Hit");
//            } else if (player.getTotalValueOfCardsInHand() > 17){
//                System.out.println("You must Stick");
//            } else if(player.getTotalValueOfCardsInHand() > 21){
//                System.out.println("You are Busted");
//                playerList.remove(player);
//            } else if(player.getTotalValueOfCardsInHand() == 21){
//                System.out.println("You won...:)");
//            }
//        } while (playerList.size() != 1);

        int playerIdentity = 1 ;
        for (Player player : playerList) {
            if(player.getTotalValueOfCardsInHand() < 17){
                System.out.println("You must Hit Player :) " +playerIdentity);
                deck.dealACardIfHit(player);
                System.out.println("You have " + player.getCardsInHand());
            } else if (player.getTotalValueOfCardsInHand() > 17){
                System.out.println("You must Stick Player :) " +playerIdentity);
            } else if(player.getTotalValueOfCardsInHand() > 21){
                System.out.println("You are Busted Player :) " +playerIdentity );
                playerList.remove(player);
            } else if(player.getTotalValueOfCardsInHand() == 21){
                System.out.println("You won... Player :) " +playerIdentity );
            }
            playerIdentity++ ;
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

