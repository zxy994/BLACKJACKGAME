import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//blackjackMaster controls the game
public class BlackJackMaster {
    Scanner scanner = new Scanner(System.in);
    Integer numOfPlayers;

    private void masterIsSpeaking(){
        System.out.println("YOU DARED TO PLAY BLACKJACK");
        System.out.println("-------------------------------");
        System.out.print("Enter number of players : \n");
        //numOfPlayers = scanner.nextInt();

        Deck deck = new Deck();
        deck.newDeck();
        deck.shuffleDeck();

        List<Player> playerList = new ArrayList<>();

        //creating players and assigning them their initial two cards
        for(int i = 1; i <= numOfPlayers; i++){
             playerList.add(new Player(deck.dealCardAtStartGame())) ;
        }

 //before we deal first two cards
        deck.dealCardAtStartGame();

        //master knows what each player hard and will determine how the
        //rest of the game proceeds
     }


}
