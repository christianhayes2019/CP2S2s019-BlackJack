package org.LickingHeights;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;


    public Hand(){
      hand = new ArrayList<>();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public void discardCards(){
        hand.clear();
    }
}
