package com.techelevator.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<Card>();
    private boolean isShuffled = false;

    

    public Deck(String[] suits, String[] ranks){
        for( String suit : suits){
            for ( String rank : ranks){
                Card currentCard = new Card(suit, rank);
                cards.add(currentCard);
            }
        }
    }

    public Card deal(){
        if(cards.size() != 0){
            return cards.remove(0);
        } else {
            return null;
        }

    }

    public void shuffle(){
        Collections.shuffle(cards);
        this.isShuffled = true;
    }

    public boolean isShuffled(){
        return this.isShuffled;
    }

    //Delegate method
    public int size(){
        return cards.size();
    }

    private void flipAllCards(){
        for(Card card : cards){
            card.flip();
        }
    }

    @Override
    public String toString() {
       flipAllCards();
       String deckAsString = "Deck" +  cards;
       flipAllCards();
       return deckAsString;
    }
}
