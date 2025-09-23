import java.util.Scanner;

public class StringPlay {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String str = "Computer Science Combo Class!";

		int index = 9;

		char ch = 'F';

		System.out.printf("Original String = %s%n", str);

		str = stringMod(index, ch, str);
		System.out.printf("Modified String = %s%n", str);
		str = buildMod(index, ch, str);
		System.out.printf("Modified String = %s%n", str);

	}

	private static String buildMod(int index, char ch, String str) {
		StringBuilder string = new StringBuilder(str);
		string.setCharAt(index, ch);
		return string.toString(); // build a string and then turn it back into a string, convert string from
									// StringBuilder to a string
	}

	private static String stringMod(int index, char ch, String str) {
		return str.substring(0, index) + ch + str.substring(index + 1);
	}

}
