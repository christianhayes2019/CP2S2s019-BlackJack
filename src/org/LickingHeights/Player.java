package org.LickingHeights;

public class Player{
    private String name;
    private int money;

    public Player() {
        name = "No Name";
        money = 0;

    }

    public Player(String name) {
        this.name = name;
        money = 0;
    }

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }




}
