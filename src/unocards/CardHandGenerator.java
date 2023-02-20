package unocards;

import unocards.Card.Color;
import unocards.Card.Ranks;
import java.util.Random;

/**
 * A class that models the Card Hand. A Card hand has an array of cards. 
 * How can you change the size of the hand?
 *
 * @author Yuvraj Bhardwaj, 2023 Feb 19.
 * 
 */

public class CardHandGenerator {

    /**
     * Generates a hand of a given size
     */
    public static Card[] generateHand(int handSize) {
        
        // we'll use this to generate random numbers
        Random random = new Random();
        
        // let's get these lengths once
        int numRanks = Card.Ranks.values().length;
        int numColor = Card.Color.values().length;
        
        // declare and initialize a hand of cards
        Card[] hand = new Card[handSize];
        
        for (int i = 0; i < handSize; i++) {
            
            // get a random color and value. Note we're not concerned about uniqueness
            // at this point
            Color randomSuit = Card.Color.values()[random.nextInt(numColor)];
            Ranks randomValue = Card.Ranks.values()[random.nextInt(numRanks)];
            
            // create a card and add it to the hand
            Card card = new Card(randomSuit, randomValue);        
            hand[i] = card;
            
        }
        
        return hand;
    }
}
