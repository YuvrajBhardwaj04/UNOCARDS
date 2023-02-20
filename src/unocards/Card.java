package unocards;

/**
 * Starter code for the Card class. 
 * Class - level comment - the ability to easily adjust the available card 
 * kinds without changing the Card class itself thanks to the
 * usage of enums for card colours and ranks.
 * Due to this capability, the Card class may be more flexible and reused in many card games.
 *
 * @author Yuvraj Bhardwaj , 2023 Feb 19
 * This class represents Uno-cards
 */
public class Card {

    public enum Color {
        Red, Green, Blue, Yellow
    }

    public enum Ranks {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD
    }
    
    private final Color Color;
    private final Ranks Ranks;

    public Card(Color Color, Ranks Ranks) {
        this.Color = Color;
        this.Ranks = Ranks;
    }

    public Ranks getRanks() {
        return this.Ranks;
    }

    public Color getColor() {
        return this.Color;
    }
}
