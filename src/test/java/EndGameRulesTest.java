import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EndGameRulesTest {

    @Test
    void allPlayersStick() {

    }

    @Test
    void playerHits21() {
        List<Card> listOfCards = List.of(new Card(Suit.CLUB, Rank.JACK),
                                        new Card(Suit.HEART, Rank.ACE));
        List<Player> listOfPlayers = List.of(new Player(listOfCards));

        EndGameRules.playerHits21(listOfPlayers);

        assertEquals(21, EndGameRules.getWinner().getTotalValueOfCardsInHand());
    }

    @Test
    void onePlayerRemaining() {
    }
}