import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EndGameRulesTest {
    // class members
    static List<Card> card1 = new ArrayList<>();
    static List<Card> card2 = new ArrayList<>();
    static List<Player> listOfPlayers = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        EndGameRulesTest.card1 = List.of(new Card(Suit.CLUB, Rank.JACK), new Card(Suit.HEART, Rank.ACE));
        EndGameRulesTest.card2 = List.of(new Card(Suit.CLUB, Rank.JACK), new Card(Suit.HEART, Rank.FOUR));
        EndGameRulesTest.listOfPlayers = List.of(new Player(card1), new Player(card2));
    }

    @Test
    void allPlayersStick() {

    }

    @Test
    void playerHits21() {
        beforeEach();
        EndGameRules.playerHits21(listOfPlayers);

        int playerTotalCardsValue = EndGameRules.getWinner().getTotalValueOfCardsInHand();

        assertEquals(21, playerTotalCardsValue);
    }

    @Test
    void onePlayerRemaining() {
        System.out.println(listOfPlayers);

        listOfPlayers.remove(1);

        System.out.println(listOfPlayers);

        EndGameRules.onePlayerRemaining(listOfPlayers);

        int playerTotalCardsValue = EndGameRules.getWinner().getTotalValueOfCardsInHand();

        assertEquals(21, playerTotalCardsValue);
    }
}