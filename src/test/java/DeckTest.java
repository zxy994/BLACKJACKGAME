import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @org.junit.jupiter.api.Test
    void newDeck() {
        Deck myStandardDeck = new Deck();

        List<Card> test = myStandardDeck.newDeck();

        System.out.println(test);

        assertEquals(52, test.size());
    }
}