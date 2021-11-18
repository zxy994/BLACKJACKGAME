
public class Card {
    private Suit suit;
    private Rank rank;
    private Integer rankValue;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.rankValue = rank.getRankValue();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Integer getRankValue() { return rankValue; }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", rankValue=" + rankValue +
                '}';
    }
}
