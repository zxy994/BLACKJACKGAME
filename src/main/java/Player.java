import java.util.ArrayList;
import java.util.List;

public class Player {
     List<Card> cardsInHand;

    Player(List<Card> cards){cardsInHand = cards;}

    void givePlayerACard(){cardsInHand.add(Deck.decks.get(Deck.decks.size()-1));}

    public List<Card> getCardsInHand() { return this.cardsInHand;}

    public Integer getTotalValueOfCardsInHand() {
        return cardsInHand.stream().mapToInt(player -> player.getRankValue()).sum();
    }

    @Override
    public String toString() {
        return "\nPlayer{ " +
                "cardsInHand=\n" + cardsInHand +
                "}\n";
    }
}
