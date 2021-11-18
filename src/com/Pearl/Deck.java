package com.Pearl;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //list to hold card collection
    static final List<Card> decks = new ArrayList<>();

    //manufacture cards
    private void manufactureCards(){
        for(int i = 0; i < 4; i++){
            for(int b = 2; b <= 11; b++){
                switch (i){
                    case 0 -> {
                        decks.add(new Cards(Suit.CLUB, b));
                        if (b == 10) {
                            decks.add(new Cards(Suit.CLUBJACK,b)) ;
                            decks.add(new Cards(Suit.CLUBQUEEN,b)) ;
                            decks.add(new Cards(Suit.CLUBKING,b)) ;
                        }
                    }
                    case 1 -> {
                        decks.add(new Cards(Suit.DIAMOND,b));
                        if (b == 10) {
                            decks.add(new Cards(Suit.DIAMONDJACK,b)) ;
                            decks.add(new Cards(Suit.DIAMONDQUEEN,b)) ;
                            decks.add(new Cards(Suit.DIAMONDKING,b)) ;
                        }
                    }
                    case 2 -> {
                        decks.add(new Cards(Suit.HEART, b));
                        if (b == 10) {
                            decks.add(new Cards(Suit.HEARTJACK,b)) ;
                            decks.add(new Cards(Suit.HEARTQUEEN,b)) ;
                            decks.add(new Cards(Suit.HEARTKING,b)) ;
                        }
                    }
                    case 3 -> {
                        decks.add(new Cards(Suit.SPADE, b));
                        if (b == 10) {
                            decks.add(new Cards(Suit.SPADEJACK,b)) ;
                            decks.add(new Cards(Suit.SPADEQUEEN,b)) ;
                            decks.add(new Cards(Suit.SPADEKING,b)) ;
                        }
                    }
                }
            }
        }
    }

    //method to create deck
    public void newDeck(){
        manufactureCards();
    }

    //method to shuffle deck
    public void shuffleDeck(){

    }

    //method to deal player two cards at the start of black jack or
    //a card when a player hits
    public void dealCards(){

    }
}
