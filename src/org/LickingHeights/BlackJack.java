package org.LickingHeights;

public class BlackJack {
    private Deck deck;

    public BlackJack() {
        deck = new Deck();
        for(int i=0; i<53;i++) {
            displayDeck();
            System.out.println( "\n\n"+   deck.dealCard() );
        }

    }

    public void displayDeck(){
        deck.printDeck();
    }
}
