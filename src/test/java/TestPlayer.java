import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Card card;
    Deck deck;
    Player player;

    @Before
    public void setup(){
        deck = new Deck();
        player = new Player("Chreun");
    }

    @Test
    public void handIsEmpty(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void addCardToHand(){
        deck.fillDeck();
        card = deck.removeCard();
        player.addCard(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void canGetName(){
        assertEquals("Chreun", player.getName());
    }



    @Test
    public void removeCardFromHand(){
        deck.fillDeck();
        card = deck.removeCard();
        player.addCard(card);
        player.removeCard();
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canShowHandValue(){
        deck.fillDeck();
        card = deck.removeCard();
        player.addCard(card);
        assertEquals(1,  player.showHandValue());
    }






}
