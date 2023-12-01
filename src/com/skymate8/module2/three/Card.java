package com.skymate8.module2.three;

import com.skymate8.module2.three.CardSuits;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
    @Override
    public int compareTo(Card c) {
        String possValues = "2345678910JQKA";
        if(possValues.indexOf(this.value) > possValues.indexOf(c.getValue())){
            return 1;
        }
        else if(possValues.indexOf(this.value) < possValues.indexOf(c.getValue())){
            return -1;
        }
        return 0;
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
