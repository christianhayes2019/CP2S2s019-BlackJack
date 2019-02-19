package org.LickingHeights;


public class Deck {

    String[] Suits = {"Hearts","Diamonds","Spades","Clubs"};
    String[] Rank = {"Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};


    private Card[] deck;




    public Deck() {
        deck = new Card[52];
        buildDeck();



    }

    private void buildDeck(){

        for(int i = 0; i < deck.length; i++){
            deck[i] = new Card();
            deck[i].setSuit(Suits[i/13]);
            deck[i].setName(Rank[i%13]);

            if(i%13<10){
                deck[i].setValue((i%13)+1);
            }

            if(i%13>=10){
                deck[i].setValue(10);
            }
        }


    }

    public void printDeck(){
        for(Card card: deck){
            System.out.println(card);
        }
    }
}
