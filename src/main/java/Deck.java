
import java.util.ArrayList;
import java.util.List;

public class Deck {
    // list to hold card collection
    public List<Card> decks = new ArrayList<>();

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
    public void shuffleDeck(){

    }

    //method to deal player two cards at the start of black jack or
    //a card when a player hits
    public void dealCards(){

    }

}
