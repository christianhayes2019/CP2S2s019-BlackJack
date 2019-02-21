package org.LickingHeights;

import java.util.ArrayList;

public class BlackJack {
    private Deck deck;
    private ArrayList<Player>players;

    public BlackJack() {
        deck = new Deck();
        players = new ArrayList<>();
        init(4);
        //displayDeck();

        for(int i=0; i<53;i++) {
            displayDeck();
            System.out.println( "\n\n"+   deck.dealCard() );
        }

    }

    private void init (int numOfPlayers){
        //createPlayers(numOfPlayers);

        for(int i=0; i< 100; i++){
            dealCard();
        }

        //placeBet();
       // printPlayers();


    }
    public void displayDeck(){
        deck.printDeck();
    }

    private void printPlayers(){
        for(Player player: players){
            System.out.println(player);
        }
    }

    private void createPlayers(int numOfPlayers){
        for(int i = 0; i<numOfPlayers; i++){
            //creating default player
            players.add(new Player(300+(0*i), "player " + i));
        }
    }
    public void removePlayer (Player player){
        players.remove(player);
    }
    public Card dealCard(){
        return deck.dealOneCard();
    }
}

