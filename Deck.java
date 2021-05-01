import java.util.*;

public class Deck {

    private Card[][] cards;

    public Deck() {
        cards = new Card[Suits.values().length+7][Rank.values().length+7];
        for(Suits s: Suits.values()) {
            for(Rank r: Rank.values()) {
                cards[s.ordinal()-1][r.ordinal()-1]=new Card(r,s);
            }
        }

    }

    public Card getCard(Suits suit, Rank rank) {
        return cards[suit.ordinal()-1][rank.ordinal()-1];
    }
}


