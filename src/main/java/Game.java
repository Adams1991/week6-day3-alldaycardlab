import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> player;

    public Game(){
        this.deck = new Deck();
        this.player =  new ArrayList<>();

    }


    public void dealCard() {
        for (Player player  : this.player) {
            deck.shuffleDeck();
            Card card = deck.removeCard();
            player.addCard(card);
        }
    }

    public Deck getDeck(){
        return this.deck;
    }

    public int playerCount() {
        return this.player.size();
    }

    public void addPlayer(Player player) {
        this.player.add(player);
    }


    public String CompareHands() {
        String winner = "";
        for (Player player1 :  this.player){
            for (Player player2 : this.player)
                if (player1.showHandValue() > player2.showHandValue())
                winner = player1.getName();
        }
        return winner + " Wins";
    }




}

