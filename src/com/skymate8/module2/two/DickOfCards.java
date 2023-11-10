package com.skymate8.module2.two;

import java.util.LinkedList;

public class DickOfCards {

    LinkedList<Card> cards = new LinkedList<>();


    public LinkedList generateDeck() {
        LinkedList<Card> cards = new LinkedList<>();
        for (CardSuits cardSuits : CardSuits.values()) {
            for (int j = 0; j < 13; j++) {
                cards.add(Card())
            }
        }
    }
}