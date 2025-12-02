
public class Player {

	private String name;
	private Hand hand;

	public Player(String name) {
		this.name = name;
		this.hand = new Hand(name);
	}

	public String getName() {
		return name;
	}

	public Hand getHand() {
		return hand;
	}

	public Card play(Player player, Card ask) {
		Card card = searchForMatch(ask);
		if (card == null) {
			System.out.println("Go Fish!");
		}
		return card;
	}

	public Card searchForMatch(Card ask) {
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.getCard(i);
			if (cardMatches(card, ask)) {
				return hand.popCard(i);
			}
		}
		return null;
	}
	

	public static boolean cardMatches(Card card1, Card ask) {
		return card1.getRank() == ask.getRank();
	}

	public int score() {
		int book = 0;
		book = hand.size()/4;
		return book;
	}

	public void display() {
		hand.display();
	}

	public void displayScore() {
		System.out.println(name + " has " + score() + " books");
	}
	


}