import java.util.Random;
import java.util.Scanner;

public class Fishing {

	private Player one;
	private Player two;
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;

	public Fishing() {

		Deck deck = new Deck("Deck");
		deck.shuffle();

		one = new Player("Player 1");
		deck.deal(one.getHand(), 7);
		two = new Player("Player 2");
		deck.deal(two.getHand(), 7);

		discardPile = new Hand("Discards");
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw pile");
		deck.dealAll(drawPile);

		in = new Scanner(System.in);
	}

	public boolean isDone() {
		return one.getHand().isEmpty() || two.getHand().isEmpty();
	}
	
	public Card ask(Hand hand) {
		if(nextPlayer(one) == one) {
			System.out.println("What card do you want from Player 2?");
			in.nextInt(hand.size());
			int oneIndex = in.nextInt(hand.size());
			Card oneValue = hand.getCard(oneIndex);
			return oneValue;
		}
		else {
			Random random = new Random();
			int ranIndex = random.nextInt(hand.size());
			Card ranValue =  hand.getCard(ranIndex);
			return ranValue;
		}
		
	}


	public Card drawCard() {
		return drawPile.popCard();
	}

	public void displayState() {
		one.display();
		System.out.print("Draw pile: ");
		System.out.println(drawPile.size() + " cards");
		in.nextLine();
	}

	public void takeTurn(Player player,Card card) {
		player.play(player, card);
		
		
	}

	public Player nextPlayer(Player current) {
		if (current == one) {
			return two;
		} else {
			return one;
		}
	}

	public void playGame() {
		Player player = one;

		while (!isDone()) {
			displayState();
			takeTurn(player, );
			player = nextPlayer(player);
		}
	}
}