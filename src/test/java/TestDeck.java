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
    public void deckStartsFull(){
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void addCardToDeck(){
        deck.addCard(card);
        assertEquals(53, deck.cardCount());
    }

    @Test
    public void canFillDeck(){
        deck.fillDeck();
        assertEquals(104, this.deck.cardCount());
    }

    @Test
    public void checkValidCardBeingAdded(){
        deck.fillDeck();
        assertEquals( SuitType.HEARTS, deck.getFirstCardSuit());
        assertEquals( RankType.ACE, deck.getFirstCardRank());
    }

    @Test
    public void removeCardFromDeck(){
        deck.fillDeck();
        deck.removeCard();
        assertEquals( 103, this.deck.cardCount());
    }





}
