import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Deck deck;
    Game game;


    @Before
    public void setup(){
        player1 = new Player("Boab");
        player2 = new Player("Billy");
        player3 = new Player("Baba");
        player4 = new Player("Bobo");
        deck = new Deck();
        game = new Game();
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canDealCard(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.dealCard();
        assertEquals(50, game.getDeck().cardCount());
    }

    @Test
    public void canCompareHands(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player4);
        game.addPlayer(player3);
        game.dealCard();
        assertEquals("Baba Wins", game.CompareHands());
    }


}
