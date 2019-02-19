package org.LickingHeights;

public class BlackJack {
    private Deck deck;

    public BlackJack() {
        deck = new Deck();
        displayDeck();

        Player player = new Player("Jef", 5);


        System.out.println("Player's name is: "+player.getName()+"\n"+player.getMoney());
    }

    public void displayDeck(){
        deck.printDeck();
    }
}
