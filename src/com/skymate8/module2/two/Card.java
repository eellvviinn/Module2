package com.skymate8.module2.two;

import java.util.Objects;

public class Card {

    private CardSuits suit;
    private char value;

    public Card(CardSuits suit, char value){
        this.suit = suit;
        this.value = value;
    }

    public CardSuits getSuit() {
        return suit;
    }

    public void setSuit(CardSuits suit) {
        this.suit = suit;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isFaceCard(Card card) {
        if(card.value == 'A' ||card.value == 'J' ||card.value == 'Q' ||card.value == 'K') {
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
        return suit + " of " + value;
    }
}
