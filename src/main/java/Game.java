public class Game {

    private Deck deck;
    private Player player;

    public Game(Deck deck, Player player){
        this.deck = deck;
        this.player = player;

    }


    public void dealCard() {
        deck.fillDeck();
        Card card = this.deck.removeCard();
        player.addCard(card);

    }
}

