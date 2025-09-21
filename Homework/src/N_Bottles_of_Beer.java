//Your task for this lab is to write a program to generate the lyrics 
//to the song “99 Bottles of Beer”. However, your program should read in
//the starting number of bottles the user wants in the song, it won’t always be 99.
//Prompt the user to enter the starting number of bottles.
//Read in the value using a Scanner object. Create a loop to loop for each bottle of beer.
//Inside the loop, print out one verse to the song. Be sure to get the plurality correct. 
//Your program should not say “1 bottles”. Be sure to get the last verse correct, 
//it should restart with the original starting number of bottles.

import java.util.Scanner;

public class N_Bottles_of_Beer {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the starting number of bottles.");
		int bottles = input.nextInt();
		int orgBottles = bottles;
		while (bottles > 2) {
			int n = bottles;
			System.out.println(
					n + " bottles of beer on the wall, " + n + " bottles of beer. Take one down and pass it around, "
							+ (n - 1) + " bottles of beer on the wall.");
			bottles -= 1;
		}
		if (bottles == 2) {
			System.out.println(
					"2 bottles of beer on the wall, 2 bottles of beer. Take one down and pass it around, 1 bottle of beer on the wall.");
			bottles -= 1;
		}
		if (bottles == 1) {
			System.out.println(
					"1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, 0 bottles of beer on the wall.");
		}
		if (bottles < 0) {
			System.out.println("You can't have a negative amount of bottles.");
		}
		System.out.println("0 bottles of beer on the wall, 0 bottles of beer.\n" + "Go to the store and buy some more, "
				+ orgBottles + " bottles of beer on the wall.");
	}

}
