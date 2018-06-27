import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    Player player;
    Deck deck;
    Card card;
    Game game;


    @Before
    public void setup(){
        player = new Player("Boab");
        deck = new Deck();
        game = new Game(deck, player);
    }

    @Test
    public void canDealCard(){
        game.dealCard();
        assertEquals(51, deck.cardCount());
    }


}
