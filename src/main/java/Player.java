import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.name = name;
    }


    public int cardCount() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public Card removeCard() {
        return this.hand.remove(0);
    }

    public int showHandValue() {
        int handtotal = 0;
        for (Card card : this.hand) {
            handtotal += card.getValueFromRank();
        }
        return handtotal;
    }

    public String getName() {
        return name;
    }
}
