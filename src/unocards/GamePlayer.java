package unocards;

/**
 * A class to handle the user interaction for the Card project. Contains a main method that generates a card hand and
 * then iterates over it to print its contents to the console.
 *
 * @author Yuvraj Bhardwaj, 2023 Feb 19 
 */
public class GamePlayer {

    public static void main(String[] args) {

        Card[] cardHand = CardHandGenerator.generateHand(7);
        for (Card card : cardHand) {
            System.out.println(card.getRanks() + " of " + card.getColor());
        }
        // System.out.println(ch.cards); show what happens when there is no toString()
    }

}
