package m02_student_code.student.cards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import m02_student_code.student.homework.Card;

/**
 * Note that you can think of the deck implementation as being an iterator in that its creates and used once. Meaning, when a card is
 * delt is  MUST be removed from the deck.
 */
public class  DeckImpl {

    /**
     * This will be the stack object for you to work with.
     */
    private Stack<Card> deck = new Stack<>();

    /**
     * Const.
     * @param jokers True if you want jokers in this deck.
     */
    public DeckImpl(final boolean jokers) {
        this.createDeck(jokers);
    }

    /**
     * Private. THis is the place where you will need to create a deck of cards. You can iterate throug
     * ther enums in Card.
     *
     * Some rules:
     * ============
     * 1. Note the boolean jokers parameter. If true add the Jokers to the deck with a Card.Suite.NONE.
     * 2. Do not create cards, other than jokers, with a Card.Suite.NONE.
     *
     * Outcome
     * ========
     * if jokers == true, 54 cards will be created.
     * if jokers == false, 52 cards are created.
     *
     * @param jokers True if you want jokers added to the deck.
     */
    private void createDeck(final boolean jokers) {
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
        if(jokers) {
        	Card j1 = new Card(Card.Suit.NONE, Card.Value.JOKER);
        	Card j2 = new Card(Card.Suit.NONE, Card.Value.JOKER);
        	deck.add(j1);
        	deck.add(j2);
        }
        }

    /**
     * Gets the deck.
     * @return The deck.
     */
    public Stack<Card> getDeck() {
        return deck;
    }
    /**
     * Randomize and shuffle the deck of cards.
     */
    public void shuffle() {
    
    	List<Card> shuffled = new LinkedList<>();
    	shuffled.addAll(deck);
    	Collections.shuffle(shuffled);
    	deck.removeAll(deck);
    	deck.addAll(shuffled);
    }

    /**
     * True if the deck has cards remaining else false.
     * @return
     */
    public boolean hasNext() {
        return !deck.isEmpty();
    }

    /**
     * Always call the hasNext() method before calling this method.
     * This method should get the next card in the deck.
     *
     * Outcome
     * =======
     * The method will remove the next from the deck and return it in the method.
     *
     * If the deck is empty it should through a RuntimeException.
     * @return
     */
    public Card dealCard() {
        return deck.pop();
    }
    @
    Override
    public String toString() {
    	return deck.toString();
    }
}
