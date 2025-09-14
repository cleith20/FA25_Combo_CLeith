//Write a Java program to get a number from the user and print 
//whether it is positive or negative.  main() should call a method 
//named  isPositive() that will return whether the number is positive.

import java.util.Scanner;

public class Exercise1 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a number.");
		isPositive();

	}
	private static void isPositive() {
		double num = input.nextDouble();
		if(num < 0)
		{
			System.out.println("That number is negative");
		}
		else
			System.out.println("That number is positive");
		
	}

}
