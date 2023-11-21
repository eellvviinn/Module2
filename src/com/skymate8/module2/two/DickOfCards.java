package com.skymate8.module2.two;

import java.util.LinkedList;
import java.util.Stack;

public class DickOfCards {

    LinkedList<Card> cards = new LinkedList<>();

    public DickOfCards(){
        cards = generateDeck();
        shuffle(cards);
    }


    public LinkedList<Card> generateDeck() {
        LinkedList<Card> cards = new LinkedList<>();

//        Elvin's way :(
//        for (CardSuits cardSuits : CardSuits.values()) {
//            for (int j = 2; j <= 10; j++) {
//                cards.add(new Card(cardSuits, String.valueOf(j)));
//        }
//            cards.add(new Card(cardSuits, "A"));
//            cards.add(new Card(cardSuits, "J"));
//            cards.add(new Card(cardSuits, "Q"));
//            cards.add(new Card(cardSuits, "K"));
//    }
//        return cards;
//        David's way :)
//        String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
//        for(CardSuits cardSuits : CardSuits.values()) {
//            for (String cardValue : value) {
//                cards.add(new Card(cardSuits, cardValue));
//            }
//        }
//        return cards;

//        lolzies/best way :-{
        cards.add(new Card(CardSuits.SPADES, "A"));
        cards.add(new Card(CardSuits.SPADES, "2"));
        cards.add(new Card(CardSuits.SPADES, "3"));
        cards.add(new Card(CardSuits.SPADES, "4"));
        cards.add(new Card(CardSuits.SPADES, "5"));
        cards.add(new Card(CardSuits.SPADES, "6"));
        cards.add(new Card(CardSuits.SPADES, "7"));
        cards.add(new Card(CardSuits.SPADES, "8"));
        cards.add(new Card(CardSuits.SPADES, "9"));
        cards.add(new Card(CardSuits.SPADES, "10"));
        cards.add(new Card(CardSuits.SPADES, "J"));
        cards.add(new Card(CardSuits.SPADES, "Q"));
        cards.add(new Card(CardSuits.SPADES, "K"));
        cards.add(new Card(CardSuits.CLOVERS, "A"));
        cards.add(new Card(CardSuits.CLOVERS, "2"));
        cards.add(new Card(CardSuits.CLOVERS, "3"));
        cards.add(new Card(CardSuits.CLOVERS, "4"));
        cards.add(new Card(CardSuits.CLOVERS, "5"));
        cards.add(new Card(CardSuits.CLOVERS, "6"));
        cards.add(new Card(CardSuits.CLOVERS, "7"));
        cards.add(new Card(CardSuits.CLOVERS, "8"));
        cards.add(new Card(CardSuits.CLOVERS, "9"));
        cards.add(new Card(CardSuits.CLOVERS, "10"));
        cards.add(new Card(CardSuits.CLOVERS, "J"));
        cards.add(new Card(CardSuits.CLOVERS, "Q"));
        cards.add(new Card(CardSuits.CLOVERS, "K"));
        cards.add(new Card(CardSuits.HEARTS, "A"));
        cards.add(new Card(CardSuits.HEARTS, "2"));
        cards.add(new Card(CardSuits.HEARTS, "3"));
        cards.add(new Card(CardSuits.HEARTS, "4"));
        cards.add(new Card(CardSuits.HEARTS, "5"));
        cards.add(new Card(CardSuits.HEARTS, "6"));
        cards.add(new Card(CardSuits.HEARTS, "7"));
        cards.add(new Card(CardSuits.HEARTS, "8"));
        cards.add(new Card(CardSuits.HEARTS, "9"));
        cards.add(new Card(CardSuits.HEARTS, "10"));
        cards.add(new Card(CardSuits.HEARTS, "J"));
        cards.add(new Card(CardSuits.HEARTS, "Q"));
        cards.add(new Card(CardSuits.HEARTS, "K"));
        cards.add(new Card(CardSuits.DIAMONDS, "A"));
        cards.add(new Card(CardSuits.DIAMONDS, "2"));
        cards.add(new Card(CardSuits.DIAMONDS, "3"));
        cards.add(new Card(CardSuits.DIAMONDS, "4"));
        cards.add(new Card(CardSuits.DIAMONDS, "5"));
        cards.add(new Card(CardSuits.DIAMONDS, "6"));
        cards.add(new Card(CardSuits.DIAMONDS, "7"));
        cards.add(new Card(CardSuits.DIAMONDS, "8"));
        cards.add(new Card(CardSuits.DIAMONDS, "9"));
        cards.add(new Card(CardSuits.DIAMONDS, "10"));
        cards.add(new Card(CardSuits.DIAMONDS, "J"));
        cards.add(new Card(CardSuits.DIAMONDS, "Q"));
        cards.add(new Card(CardSuits.DIAMONDS, "K"));
        return cards;
    }
    public void shuffle(LinkedList<Card> deck){
        LinkedList<Card> newCards = new LinkedList<>(deck);
        cards.clear();
        while (newCards.size() > 0) {
            int randInt = (int)(Math.floor(Math.random() * newCards.size()));
            cards.add(newCards.get(randInt));
            newCards.remove(randInt);
        }
    }
    public LinkedList<Card> pull7 (LinkedList<Card> deck){
        LinkedList<Card> newCards = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            newCards.add(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
        return newCards;
    }

}