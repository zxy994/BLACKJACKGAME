package com.Pearl;

public class Cards {
   private static Suits suit;
   private static Integer value;

   public Cards(Suits suit, Integer value){
    Cards.suit = suit ;
    Cards.value = value ;
   }

   public Integer getValue(){
       return value ;
   }
}
