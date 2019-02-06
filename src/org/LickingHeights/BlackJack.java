package org.LickingHeights;

public class BlackJack {
    private Deck deck;

    public BlackJack() {
        deck = new Deck();
        displayDeck();
    }

    public void displayDeck(){
        deck.printDeck();
    }
}
