import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> player;

    public Game(Deck deck){
        this.deck = new Deck();
        this.player =  new ArrayList<>();

    }


    public void dealCard() {
        this.deck.shuffleDeck();
        for (Player player  : this.player) {
            player.addCard(deck.removeCard());
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
}

