import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
class BlackJackMasterTest {

    @Test
    void getEachPLayersValue() {
        List<Card> cards = List.of(
                new Card(Suit.CLUB, Rank.ACE) ,
                new Card(Suit.HEART, Rank.EIGHT)
        );
        Player player = new Player(cards) ;

        player.getTotalValueOfCardsInHand();

        assertEquals(19,player.getTotalValueOfCardsInHand());
    }
}