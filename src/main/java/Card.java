
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Integer getRankValue() { return rank.getRankValue(); }

    @Override
    public String toString() {
        return "\n\tCard{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", rankValue=" + rank.getRankValue() +
                '}';
    }
}
