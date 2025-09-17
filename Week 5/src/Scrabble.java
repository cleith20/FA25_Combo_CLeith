import java.util.Scanner;

public class Scrabble {
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
		int len = word.length();
		int count = 0;
		char[] newWord = tiles.toCharArray();
		for (int i = 0; i < len; i++) {

			char letter = word.charAt(i);
			for (int j = 0; j < tiles.length(); j++) {
				if (newWord[j] == letter) {
					newWord[j] = '*';
					count++;
					break;

				}

			}
		}
		if (count != len)
			return false;
		return true;
	}

}
