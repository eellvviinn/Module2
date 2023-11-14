package com.skymate8.module2.two;

import java.util.LinkedList;

public class DickOfCards {

    LinkedList<Card> cards = new LinkedList<>();


    public LinkedList generateDeck() {
//        LinkedList<Card> cards = new LinkedList<>();
//        for (CardSuits cardSuits : CardSuits.values()) {
//            for (int j = 0; j < 13; j++) {
//                cards.add(new Card(cardSuits, 'j'));
//
//        }
//        return cards;
//    }
//        char[] value = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K'};
//        String[] suits = {"SPADES", "CLOVER", "HEARTS", "DIAMONDS"};
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 4; j++) {
//                cards.add(new Card(CardSuits.suits[j], value[i]));
//            }
//        }
        cards.add(new Card(CardSuits.SPADES, 'A'));
        cards.add(new Card(CardSuits.SPADES, '2'));
        cards.add(new Card(CardSuits.SPADES, '3'));
        cards.add(new Card(CardSuits.SPADES, '4'));
        cards.add(new Card(CardSuits.SPADES, '5'));
        cards.add(new Card(CardSuits.SPADES, '6'));
        cards.add(new Card(CardSuits.SPADES, '7'));
        cards.add(new Card(CardSuits.SPADES, '8'));
        cards.add(new Card(CardSuits.SPADES, '9'));
        cards.add(new Card(CardSuits.SPADES, '1'));
        cards.add(new Card(CardSuits.SPADES, 'J'));
        cards.add(new Card(CardSuits.SPADES, 'Q'));
        cards.add(new Card(CardSuits.SPADES, 'K'));
        cards.add(new Card(CardSuits.CLOVERS, 'A'));
        cards.add(new Card(CardSuits.CLOVERS, '2'));
        cards.add(new Card(CardSuits.CLOVERS, '3'));
        cards.add(new Card(CardSuits.CLOVERS, '4'));
        cards.add(new Card(CardSuits.CLOVERS, '5'));
        cards.add(new Card(CardSuits.CLOVERS, '6'));
        cards.add(new Card(CardSuits.CLOVERS, '7'));
        cards.add(new Card(CardSuits.CLOVERS, '8'));
        cards.add(new Card(CardSuits.CLOVERS, '9'));
        cards.add(new Card(CardSuits.CLOVERS, '1'));
        cards.add(new Card(CardSuits.CLOVERS, 'J'));
        cards.add(new Card(CardSuits.CLOVERS, 'Q'));
        cards.add(new Card(CardSuits.CLOVERS, 'K'));
        cards.add(new Card(CardSuits.HEARTS, 'A'));
        cards.add(new Card(CardSuits.HEARTS, '2'));
        cards.add(new Card(CardSuits.HEARTS, '3'));
        cards.add(new Card(CardSuits.HEARTS, '4'));
        cards.add(new Card(CardSuits.HEARTS, '5'));
        cards.add(new Card(CardSuits.HEARTS, '6'));
        cards.add(new Card(CardSuits.HEARTS, '7'));
        cards.add(new Card(CardSuits.HEARTS, '8'));
        cards.add(new Card(CardSuits.HEARTS, '9'));
        cards.add(new Card(CardSuits.HEARTS, '1'));
        cards.add(new Card(CardSuits.HEARTS, 'J'));
        cards.add(new Card(CardSuits.HEARTS, 'Q'));
        cards.add(new Card(CardSuits.HEARTS, 'K'));
        cards.add(new Card(CardSuits.DIAMONDS, 'A'));
        cards.add(new Card(CardSuits.DIAMONDS, '2'));
        cards.add(new Card(CardSuits.DIAMONDS, '3'));
        cards.add(new Card(CardSuits.DIAMONDS, '4'));
        cards.add(new Card(CardSuits.DIAMONDS, '5'));
        cards.add(new Card(CardSuits.DIAMONDS, '6'));
        cards.add(new Card(CardSuits.DIAMONDS, '7'));
        cards.add(new Card(CardSuits.DIAMONDS, '8'));
        cards.add(new Card(CardSuits.DIAMONDS, '9'));
        cards.add(new Card(CardSuits.DIAMONDS, '1'));
        cards.add(new Card(CardSuits.DIAMONDS, 'J'));
        cards.add(new Card(CardSuits.DIAMONDS, 'Q'));
        cards.add(new Card(CardSuits.DIAMONDS, 'K'));
        return cards;
    }
}