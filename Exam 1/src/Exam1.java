import java.util.Scanner;

public class Exam1 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		MessagePrinter();
		BeverageSelector();
		Divider();
		Accumulator();

	}

	private static void Accumulator() {
		System.out.println("Please enter a number.");
		int num = input.nextInt();
		int total = 0;
		total += num;
		while (num != 0) {
			System.out.println("Please enter a number.");
			num = input.nextInt();
			total += num;
		}
		System.out.println("The sum of the numbers is " + total + ".");
	}

	private static void Divider() {
		System.out.println("Please enter the first number.");
		double input1 = input.nextDouble();
		System.out.println("Please enter the second number.");
		double input2 = input.nextDouble();
		double answer = input1 / input2;
		System.out.println("The answer is " + answer + " when you divide " + input1 + " by " + input2 + "!");

	}

	private static void BeverageSelector() {
		System.out.println("Please choose a number to get a beverage: 1, 2, or 3");
		int bevNum = input.nextInt();
		switch (bevNum) {
			case 1:
				System.out.println("Water");
				break;
			case 2:
				System.out.println("Coke");
				break;
			case 3:
				System.out.println("Coffee");
				break;
			default:
				System.out.println("Not an option.");
				break;
		}

	}

	private static void MessagePrinter() {
		System.out.println("This is my first programming test.");

	}

}
