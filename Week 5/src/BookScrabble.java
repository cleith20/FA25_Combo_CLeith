import java.util.Scanner;

public class BookScrabble {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 7 letters.");
		String tiles = input.next();
		System.out.println("Enter a word.");
		String word = input.next();

		boolean canSpell = canSpell(word, tiles);
		if (canSpell) {
			System.out.println("Can spell");
		} else {
			System.out.println("Can't spell");

		}

	}

	private static boolean canSpell(String word, String tiles) {
		for (int i = 0; i < word.length(); i++) {
			int index = tiles.indexOf(word.charAt(i));
			if (index < 0)
				return false;
			else {
				tiles = tiles.substring(0, index) + tiles.substring(index + 1);
			}
		}
		return true;
	}
}
