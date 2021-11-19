import java.util.List;

public class Player {
    static List<Card> cardsInHand;

    Player(List<Card> cards){
        cardsInHand = cards ;
            }

            Player(){
        cardsInHand.add(Deck.decks.get(Deck.decks.size()-1)) ;
            }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

}
