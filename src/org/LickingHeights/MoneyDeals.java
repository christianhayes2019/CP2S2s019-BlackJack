package org.LickingHeights;

import java.util.ArrayList;

public class MoneyDeals {



    /*double playerBet;
    double lose;
    double win;
    double bet;
    float moneyLeft;*/

    static float kiddie;
    static float playerMoney;
    static boolean endgame;




    public static void distributeWinnings(Player player){
        player.addWinnings(player.getBet()*2);

    }

    public static void takeBets(ArrayList<Player> players){
        for(Player player: players){
            kiddie += player.getBet();
        }
    }

    public static void bust(Player player){
        if (playerMoney<=0){
            endgame = true;
        }
    }



    /*public MoneyDeals(double playerMoney, double lose, double win, double bet, float moneyLeft) {
        this.playerBet = playerMoney;
        this.lose = lose;
        this.win = win;
        this.bet = bet;
        this.moneyLeft = moneyLeft;
    }*/

    private MoneyDeals() {
    }
}