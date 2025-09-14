//Write a Java program that reads a number from the user between 1 and 7, 
//calls a method called getWeekDay() to get the day of the week 
//corresponding to the number, and displays the name of the weekday. 
import java.util.Scanner;

public class Exercise4 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number between 1-7 to receive the corresponding day of the week.");
		getWeekDay();

	}

	private static String getWeekDay() {
		int userNum = input.nextInt();
		if (userNum > 7 || userNum < 1) {
			System.out.println("Error.");
		} else
			switch (userNum) {
			case (1):
				System.out.println("Sunday");
				break;
			case (2):
				System.out.println("Monday");
				break;
			case (3):
				System.out.println("Tuesday");
				break;
			case (4):
				System.out.println("Wednesday");
				break;
			case (5):
				System.out.println("Thursday");
				break;
			case (6):
				System.out.println("Friday");
				break;
			case (7):
				System.out.println("Saturday");
			}

		return null;

	}

}
