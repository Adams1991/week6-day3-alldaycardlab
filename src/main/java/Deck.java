import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
        fillDeck();
    }


    public int cardCount() {
        return this.deck.size();
    }

    public void addCard(Card card) {
        this.deck.add(card);
    }


    public void fillDeck() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }


    public SuitType getFirstCardSuit() {
        Card card = this.deck.get(0);
        return card.getSuit();
    }

    public RankType getFirstCardRank() {
        Card card = this.deck.get(0);
        return card.getRank();
    }

    public Card removeCard() {
        return this.deck.remove(0);
    }
}
