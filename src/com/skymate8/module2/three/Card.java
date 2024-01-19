package com.skymate8.module2.three;

import java.util.Objects;

public class Card {
    private Suit suit;
    private String value;
    private boolean isFaceCard;

    public Card(Suit suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceCard = (value.equals("K") || value.equals("Q") || value.equals("J"));
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getvalue() {
        return value;
    }

    public void setvalue(String value) {
        this.value = value;
        this.isFaceCard = (value.equals("K") || value.equals("Q") || value.equals("J"));
    }

    public boolean isFaceCard() {
        return isFaceCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value.equals(card.value) && isFaceCard == card.isFaceCard && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value, isFaceCard);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                ", isFaceCard=" + isFaceCard +
                '}';
    }
}