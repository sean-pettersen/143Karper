package com.olympic.cis143.m03.student.homework;
import java.util.*;
     /*Author: Joseph Karper */

public class DeckIteratorImpl implements Deck {

	List<Card> deck;
	Iterator<Card> iterator;
	Random r;
	
	public DeckIteratorImpl(boolean hasJokers) {
		deck = new ArrayList<Card>();
		
		r = new Random();
		 for(Card.Suit suit : Card.Suit.values()) {
		    	if(suit == Card.Suit.NONE) {
					continue;
				}

		    	for(Card.Value value :Card.Value.values()) {
		    		    		if(value == Card.Value.JOKER) {
		    			continue;
		    		}
		    		Card card = new Card(suit,value);
		    		deck.add(card);
		    	}
		    }
		    if(hasJokers) {
		    	Card j1 = new Card(Card.Suit.NONE, Card.Value.JOKER);
		    	Card j2 = new Card(Card.Suit.NONE, Card.Value.JOKER);
		    	deck.add(j1);
		    	deck.add(j2);
		    }
		    iterator = deck.iterator();
	}
	
	
	@Override
	public List<Card> getDeck() {
		return deck;
	}

	@Override
	public void shuffle() {
		//loop a bunch of times
		 //grab random card and put it @ end of deck
		int numCards = deck.size();
		for(int i  = 0; i < numCards * 2; i++) {
			//grab a random card
			int rndIndex = r.nextInt(numCards); //[0, numCards -1]
			Card rndCard = deck.get(rndIndex);
			//place card @ back of deck
			deck.add(rndCard);
		}
		iterator = deck.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Card dealCard() {
		return iterator.next();
	}

}
