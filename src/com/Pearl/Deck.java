package com.Pearl;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //list to hold card collection
    static final List<Cards> decks = new ArrayList<>();

    //manufacture cards
    private void manufactureCards(){
        for(int i = 0; i < 4; i++){
            for(int b = 2; b <= 11; b++){
                switch (i){
                    case 0 -> {
                        decks.add(new Cards(Suits.CLUB, b));
                        if (b == 10) {
                            decks.add(new Cards(Suits.CLUBJACK,b)) ;
                            decks.add(new Cards(Suits.CLUBQUEEN,b)) ;
                            decks.add(new Cards(Suits.CLUBKING,b)) ;
                        }
                    }
                    case 1 -> {
                        decks.add(new Cards(Suits.DIAMOND,b));
                        if (b == 10) {
                            decks.add(new Cards(Suits.DIAMONDJACK,b)) ;
                            decks.add(new Cards(Suits.DIAMONDQUEEN,b)) ;
                            decks.add(new Cards(Suits.DIAMONDKING,b)) ;
                        }
                    }
                    case 2 -> {
                        decks.add(new Cards(Suits.HEART, b));
                        if (b == 10) {
                            decks.add(new Cards(Suits.HEARTJACK,b)) ;
                            decks.add(new Cards(Suits.HEARTQUEEN,b)) ;
                            decks.add(new Cards(Suits.HEARTKING,b)) ;
                        }
                    }
                    case 3 -> {
                        decks.add(new Cards(Suits.SPADE, b));
                        if (b == 10) {
                            decks.add(new Cards(Suits.SPADEJACK,b)) ;
                            decks.add(new Cards(Suits.SPADEQUEEN,b)) ;
                            decks.add(new Cards(Suits.SPADEKING,b)) ;
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
