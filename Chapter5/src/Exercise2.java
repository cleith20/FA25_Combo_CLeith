//Take three numbers from the user and print the greatest number. 
//main() should call a method named greatestNumber() that takes 
//the 3 numbers and returns the greatest number.

import java.util.Scanner;

public class Exercise2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter 1 number.");
		greatestNumber();

	}

	private static void greatestNumber() {
		int userNum1 = input.nextInt();
		System.out.println("Enter another number");
		int userNum2 = input.nextInt();
		System.out.println("Enter the last number.");
		int userNum3 = input.nextInt();
		if (userNum1 > userNum2 && userNum1 > userNum3) {
			System.out.println("The greatest number is the first input: " + userNum1);
		} else if (userNum2 > userNum1 && userNum2 > userNum3)
			System.out.println("The greatest number is the second input: " + userNum2);
		else
			System.out.println("The greatest number is the third input: " + userNum3);
	}

}
