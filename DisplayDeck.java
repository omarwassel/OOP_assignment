

public class DisplayDeck {
    public static void main(String[] args) {

        Deck deck = new Deck();

        for (Suits s : Suits.values()) {
            for (Rank r : Rank.values()) {
                Card card = deck.getCard(s, r);
                System.out.format("%s of %s%n",
                        card.rankToString(card.getRank()),
                        card.suitToString(card.getSuit()));
            }
        }
    }
}
