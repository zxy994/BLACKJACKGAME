import java.util.List;

public class Player {
    List<Card> cardsInHand;

    Player(List cards){
        cardsInHand = cards ;
            }

            Player(){
        cardsInHand.add(Deck.decks.get(Deck.decks.size()-1)) ;
            }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

}
