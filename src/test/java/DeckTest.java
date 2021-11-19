import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    private List<Card> standardDeck = new ArrayList<>();
    private List<Card> shuffledDeck = new ArrayList<>();

    private Deck deck = new Deck();

    @org.junit.jupiter.api.Test
    void newDeck() {
        // creating new deck
        standardDeck = deck.newDeck();

        assertEquals(52, standardDeck.size());

    }

    @Test
    void shuffleDeck() {
        // creating new deck
        standardDeck = deck.newDeck();

        System.out.println(standardDeck);

        // shuffling our deck
        shuffledDeck = deck.shuffleDeck();
           System.out.println(shuffledDeck);
    }

    @Test
    void dealCardAtStartGame() {
        // creating new deck
        standardDeck = deck.newDeck();
        //shuffling deck
        shuffledDeck = deck.shuffleDeck() ;

        // creating a new player list
        List<Player> playerList = List.of(
                new Player(deck.dealCardAtStartGame()),
                new Player(deck.dealCardAtStartGame()),
                new Player(deck.dealCardAtStartGame())
        );

        Player playerOne =  playerList.get(0);
        System.out.println(playerOne.getCardsInHand());
        System.out.println(playerOne.getTotalValueOfCardsInHand());

        assertEquals(46, standardDeck.size());
    }

    @Test
    void dealACardIfHit() {
        // creating new deck
        standardDeck = deck.newDeck();
        //shuffling deck
        shuffledDeck = deck.shuffleDeck() ;

        Player player = new Player(deck.dealCardAtStartGame()) ;
        System.out.println(player.getCardsInHand());

        deck.dealACardIfHit(player);
        System.out.println(player.getCardsInHand());
        assertEquals(3,player.getCardsInHand().size());
        assertEquals(49, standardDeck.size());
    }
}