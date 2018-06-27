import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;
    Card card;

    @Before
    public void setup(){
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.EIGHT);
    }

    @Test
    public void deckIsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void addCardToDeck(){
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }





}
