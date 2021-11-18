package com.Pearl;

public class Card {
    private Suit suit;
    private Rank value;

    public Card(Suit suit, Rank value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getValue() {
        return value;
    }

    public void setValue(Rank value) {
        this.value = value;
    }
}
