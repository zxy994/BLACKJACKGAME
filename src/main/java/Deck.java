
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // list to hold card collection
    public static List<Card> decks = new ArrayList<>();

    //manufacture cards
    private void manufactureCards(){
        for(Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                decks.add(new Card(suit, rank));
            }
        }
    }

    //method to create deck
    public List<Card> newDeck(){
        this.manufactureCards();

        return decks;
    }

    //method to shuffle deck
    public List<Card> shuffleDeck(){
         Collections.shuffle(decks);
        return decks ;
    }

    //method to deal player two cards at the start of black jack or
    //a card when a player hits

    public List<Card> dealCardAtStartGame(){

    //new list to hold two cards at the start of the game
        List<Card> cardsAssignedToPlayer = new ArrayList<>();

    //first card assigned
        cardsAssignedToPlayer.add(decks.get(decks.size()-1));
        decks.remove(decks.size()-1) ;

     //second card assigned
        cardsAssignedToPlayer.add(decks.get(decks.size()-1));
        decks.remove(decks.size()-1) ;

        return cardsAssignedToPlayer;
    }

    public void dealACardIfHit() {
        new Player();
        decks.remove(decks.size()-1) ;
    }
}
