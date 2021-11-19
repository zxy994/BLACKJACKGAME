import java.util.ArrayList;
import java.util.List;

public class Player {
     List<Card> cardsInHand;
     String status = "";

    public Player(List<Card> cards){cardsInHand = cards;}

    public Player(){}

    void givePlayerACard(){cardsInHand.add(Deck.decks.get(Deck.decks.size()-1));}

    public List<Card> getCardsInHand() { return this.cardsInHand;}

    public Integer getTotalValueOfCardsInHand() {
        return cardsInHand.stream().mapToInt(player -> player.getRankValue()).sum();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nPlayer{ " +
                "cardsInHand=\n" + cardsInHand +
                "}\n";
    }
}
