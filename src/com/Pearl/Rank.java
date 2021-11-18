package com.Pearl;

public enum Rank {
    ONE(1), TWO(2), THREE(3),
    FOUR(4), FIVE(5), SIX(6),
    SEVEN(7), EIGHT(8), NINE(9),
    TEN(10), JACK(10), QUEEN(10),
    KING(10), ACE(11);

    //Instance variable
    private int rankValue;

    //Constructor to initialize the instance variable
    Rank(int i) {
        this.rankValue = i;
    }
}
