//For this lab exercise, you are to write a program that reads in a number of positive integers from the user, 
//stores them in an array, and prints them out in the reverse order. 
//The user will enter the numbers one on each line and will use -1 to mark the end. 
//The user will never enter more than 100 numbers.

import java.util.Scanner;

public class ArrayReversal {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = new int[100];
		System.out.println("Enter values (-1 to stop)");

		fillArray(array);
		printArray(array);

	}

	private static void printArray(int[] array) {
		int index = 99;
		for (int i = 99; i > 1; i--)

		{
			if (array[i] == -1) {
				index = i - 1;
				break;
			}
		}
		for (int i = index; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	private static void fillArray(int[] array) {
		for (int i = 0; i < 100; i++) {
			int in = input.nextInt();
			array[i] = in;
			if (in == -1)
				break;
		}

	}

}
