import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    Card card;

    @Before
    public void setup(){
        card = new Card(SuitType.HEARTS, RankType.EIGHT);

    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.EIGHT, card.getRank());
    }

    @Test
    public void canGetValueFromRank(){
        assertEquals(8, card.getValueFromRank());
    }

}
