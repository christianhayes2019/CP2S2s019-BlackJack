package org.LickingHeights;

public class Player {
    //temp to test
    int amount;
    String name;

    public Player(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                '}';

    }
}
