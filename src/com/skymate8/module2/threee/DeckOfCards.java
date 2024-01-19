package com.skymate8.module2.threee;

import java.util.LinkedList;

public class DeckOfCards {

    LinkedList<Card> cards = new LinkedList<>();

    public DeckOfCards(){
        cards = generateDeck();
        shuffle(cards);
    }

    public LinkedList<Card> generateDeck() {
        LinkedList<Card> cards = new LinkedList<>();
        String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for(CardSuits cardSuits : CardSuits.values()) {
            for (String cardValue : value) {
                cards.add(new Card(cardSuits, cardValue));
            }
        }
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