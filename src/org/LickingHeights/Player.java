package org.LickingHeights;

import java.util.ArrayList;

public class Player {
    private String name;
    private int money;
    private int bet;
    private Hand hand;


    public Player() {
        this.name = "Jef";
        money = 500;

    }

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        hand = new Hand();

    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }


    public void hitMe(Card card) {
        hand.addCard(card);

    }

    public void bet(int amount) {
        bet = amount + bet;
        money = money - amount;
    }

    public void stand() {

    }

    public void addWinnings(int winnings){
        money = money + winnings;
    }

    public int getBet(){
        return bet;
    }

    public void reset(){
        bet = 0;
        hand.discardCards();
    }

}
