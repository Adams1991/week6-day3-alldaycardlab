import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    Player player1;
    Player player2;
    Deck deck;
    Game game;


    @Before
    public void setup(){
        player1 = new Player("Boab");
        player1 = new Player("Billy");
        deck = new Deck();
        game = new Game(deck);
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canDealCard(){
        game.addPlayer(player1);
        game.dealCard();
        assertEquals(51, game.getDeck().cardCount());
    }

//    @Test
//    public void canCompareHands(){
//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        game.dealCard();
//        assertEquals(, game.;
//    }


}
