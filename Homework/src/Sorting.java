//For this lab exercise, you are to write a program that reads in a number of 
//Strings from the user, stores them in an array, and prints them out twice, 
//once sorted alphabetically from A-Z, 
//and then sorted alphabetically from Z-A.

import java.util.Scanner;

public class Sorting {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How many strings?");
		int len = input.nextInt();
		String[] array = new String[len];
		for (int i = 0; i < len; i++) {
			array[i] = input.next();
		}

		bubbleSortAZ(array);
		printArray(array);
		System.out.println();

		bubbleSortZA(array);
		printArray(array);
	}

	private static void printArray(String[] array) {
		for (String word : array) {
			System.out.println(word);
		}

	}

	public static void bubbleSortAZ(String[] array) {
		for (int i = 0; i < array.length - 1; i++) 
			for (int j = 1; j < array.length - i; j++)
				if (array[j - 1].compareTo(array[j]) > 0)
					swap(array, j - 1, j);

	}

	private static void bubbleSortZA(String[] array) {
		for (int i = 0; i < array.length - 1; i++) 
			for (int j = 1; j < array.length - i; j++)
				if (array[j - 1].compareTo(array[j]) < 0)
					swap(array, j - 1, j);

	}

	private static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
