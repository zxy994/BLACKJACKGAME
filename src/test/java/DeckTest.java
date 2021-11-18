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

        // System.out.println(standardDeck);

        // shuffling our deck
        shuffledDeck = deck.shuffleDeck();
    //    System.out.println(shuffledDeck);

        // creating a new player list
        List<Player> playerList = List.of(
                new Player(deck.dealCardAtStartGame()),
                new Player(deck.dealCardAtStartGame()),
                new Player(deck.dealCardAtStartGame())
        );

          Player playerOne =  playerList.get(0);
        System.out.println(playerOne.getCardsInHand());

        assertEquals(46, standardDeck.size());

        /*deck.dealCardAtStartGame();

        assertEquals(50, standardDeck.size());

        deck.dealACardIfHit();
        deck.dealACardIfHit();

        //assertEquals(4,Player.cardsInHand.size());
        assertEquals(49, standardDeck.size());
        */


    }

}