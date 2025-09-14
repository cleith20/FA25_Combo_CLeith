//Write a Java program that reads a floating-point number 
//and prints "zero" if the number is zero. Otherwise, print 
//"positive" or "negative" if the number is positive or negative 
//respectively. Add "small" if the absolute value of the 
//number is less than 1, or "large" if it exceeds 1,000,000

import java.util.Scanner;

public class Exercise3 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number.");
		double userNum = input.nextDouble();

		if (userNum < 0) {
			System.out.print("This number is negative");
		} else if (userNum > 0) {
			System.out.print("This number is positive");
		} else
			System.out.print("Zero");
		if (Math.abs(userNum) < 1 && userNum != 0) {
			System.out.println(" and small.");
		} else if (Math.abs(userNum) > 1000000)
			System.out.println(" and large.");
		else
			System.out.println(".");

	}
}
