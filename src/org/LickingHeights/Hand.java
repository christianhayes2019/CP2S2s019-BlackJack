package org.LickingHeights;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> playerHand;


    public Hand(){
      playerHand = new ArrayList<>();
    }

    public void addCard(Card card){
        playerHand.add(card);
    }

    public void discardCards(){
        playerHand.clear();
    }
}
