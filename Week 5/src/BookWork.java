import java.util.Scanner;

public class BookWork {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// primitive objects are lower case (not String)
		int x = 10;
		if (x > 0) {
			System.out.println("x is positive");
		} else if (x < 0) {
			System.out.println("x is negative");
		} else {
			System.out.println("x is zero");
		}
		if (x % 2 == 0) {
			System.out.println("x is even.");
		} else
			System.out.println("x is odd");
		System.out.println("Enter a number between 1 and 5");
		int num = input.nextInt();
		String word;

		switch (num) {
		case 1:
			word = "One";
			break;
		case 2:
			word = "Two";
			break;
		case 3:
			word = "Three";
			break;
		case 4:
			word = "Four";
			break;
		case 5:
			word = "Five";
			break;
		default:
			word = "Unknown";
			break;
		}
		System.out.println(word);

		int n = 10;// the initializer
		while (n > 0)// the condition //while loop when we don't know how many
		{
			System.out.println(n);
			n--; // the changer
		}
		System.out.println("Blast Off!");

		// for loops are array loops and we use i which means index within the array
		// initializer (init), condition, changer all in one
		for (int i = 0; i < 10; i++)// array loops because we know exactly how many
		{
			System.out.println(i);
		}
//		for(int i = 0; i < 10; i++)
//		{
//			System.out.println();
//		}
		System.out.println("Enter the number of columns for the times table.");
		int cols = input.nextInt();

		System.out.println("Enter the number of rows for the times table.");
		int rows = input.nextInt();

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= cols; j++) {
				System.out.printf("%4d",( i * j));//"%4d" is a format flag, for this, we want four spaces and a digit
			}
			System.out.println();
		}
		int count = 0;
		for(char c = '0'; c <= 'z';c++, count++)
		{
			if(count % 10 == 0)System.out.println();
			System.out.print(c +  " ");
		}

	}

}
