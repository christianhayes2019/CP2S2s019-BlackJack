package org.LickingHeights;

import java.util.Scanner;

public class BlackJack extends Player{
    private Deck deck;
    public BlackJack() {
        super();
        deck = new Deck();
        displayDeck();

        Player player = new Player("Jef", 500);


        Scanner choice = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Player's name is: "+player.getName());
        System.out.println("You have $"+player.getMoney());
        System.out.println("How much would you like to bet?");
        bet = keyboard.nextInt();
        System.out.println("You now have $"+bet);


    }


    public void displayDeck(){
        deck.printDeck();
    }

}
