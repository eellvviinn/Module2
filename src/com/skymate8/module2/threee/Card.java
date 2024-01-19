package com.skymate8.module2.threee;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private CardSuits suit;
    private String value;

    public Card(CardSuits suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public CardSuits getSuit() {
        return suit;
    }

    public void setSuit(CardSuits suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isFaceCard(Card card) {
        if(card.value.equals("A") ||card.value.equals("J") ||card.value.equals("Q") ||card.value.equals("K")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Card card) {
            return value.equals(card.value) && suit == card.suit;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }
    @Override
    public String toString() {
        return value +  " of "  + suit;
    }

    public int compareSuit(Card c) {
        int thisPos = -1;
        int cPos = -1;
        CardSuits[] cOrder = {CardSuits.SPADES, CardSuits.HEARTS, CardSuits.CLOVERS, CardSuits.DIAMONDS};
        for (int i = 0; i < 4; i++) {
            if(this.getSuit()==cOrder[i]){
                thisPos = i;
            }
            if(c.getSuit()==cOrder[i]){
                cPos = i;
            }
        }
        if(thisPos>cPos){
            return 1;
        }
        if(thisPos<cPos){
            return 1;
        }
        return 0;
    }

}
