import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }


    public int cardCount() {
        return this.deck.size();
    }

    public void addCard(Card card) {
        this.deck.add(card);

    }
}
