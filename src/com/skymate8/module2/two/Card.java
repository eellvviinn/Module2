package com.skymate8.module2.two;

import java.util.Objects;

public class Card {

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
            return value == card.value && suit == card.suit;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public String toString() {
        return suit +  "of"  + value;
    }
}
