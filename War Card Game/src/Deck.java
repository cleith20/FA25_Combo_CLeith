import java.util.Random;

public class Deck {
	private Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	
	
	
	public void selectionSort()
	{
		for (int i = 0; i < cards.length-1; i++) {
			int bigindex = 0;
			for (int j = 1; j < cards.length-i; j++) {
				if (cards[j].compareTo(cards[bigindex])>0) {
					bigindex = j;
				}
				swap(bigindex,cards.length-i-1);
			}
			
		}
	}

	public void insertionSort() {
		for (int i = 1; i < cards.length; i++) {
			for (int j = i; (j > 0) && cards[j].compareTo(cards[j - 1]) < 0; j--) {
				swap(j,j-1);
			}

		}
	}

	public void bubbleSort() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 1; j < cards.length - i; j++) {
				if (cards[j - 1].compareTo(cards[j]) > 0) {
					swap(j - 1, j);
				}
			}
		}
	}
	
	public void subdeck(int low, int high) {
	    Deck sub = new Deck(high - low + 1);
	    for (int i = 0; i < sub.cards.length; i++) {
	        sub.cards[i] = this.cards[low + i];
	    }
	    return;
	}

	public Card[] getCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			swap(i, randomInt(i, cards.length));
		}
	}

	private static int randomInt(int low, int high) {
		Random rand = new Random();
		int num = rand.nextInt(high - low) + low;
		return num;
	}

	private void swap(int i, int j) { // the private shows that these are helper/instance methods
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}

	public void printCards() {
		int n = 0;
		for (Card card : cards) {
			if (n % 13 == 0 && n != 0)
				System.out.println();
			System.out.print(card + ", ");
			n++;
		}

	}

}
