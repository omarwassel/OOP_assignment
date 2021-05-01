public class Card {

    private final Rank rank;
    private final Suits suit;

    public Card(Rank rank, Suits suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public Suits getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public static boolean isValidRank(Rank rank) {
        return  rank.compareTo(Rank.ACE)>=0 && rank.compareTo(Rank.KING)<=0;
    }

    public static boolean isValidSuit(Suits suit) {
        return  suit.compareTo(Suits.DIAMONDS)>=0 && suit.compareTo(Suits.SPADES) <=0 ;
    }

    public static String rankToString(Rank rank) {
        switch (rank) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                //Handle an illegal argument.  There are generally two
                //ways to handle invalid arguments, throwing an exception
                //(see the section on Handling Exceptions) or return null
                return null;
        }
    }

    public static String suitToString(Suits suit) {
        switch (suit) {
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        // must run program with -ea flag (java -ea ..) to
        // use assert statements
        assert rankToString(Rank.ACE) == "Ace";
        assert rankToString(Rank.DEUCE) == "Deuce";
        assert rankToString(Rank.THREE) == "Three";
        assert rankToString(Rank.FOUR) == "Four";
        assert rankToString(Rank.FIVE) == "Five";
        assert rankToString(Rank.SIX) == "Six";
        assert rankToString(Rank.SEVEN) == "Seven";
        assert rankToString(Rank.EIGHT) == "Eight";
        assert rankToString(Rank.NINE) == "Nine";
        assert rankToString(Rank.TEN) == "Ten";
        assert rankToString(Rank.JACK) == "Jack";
        assert rankToString(Rank.QUEEN) == "Queen";
        assert rankToString(Rank.KING) == "King";

        assert suitToString(Suits.DIAMONDS) == "Diamonds";
        assert suitToString(Suits.CLUBS) == "Clubs";
        assert suitToString(Suits.HEARTS) == "Hearts";
        assert suitToString(Suits.SPADES) == "Spades";

    }
}

