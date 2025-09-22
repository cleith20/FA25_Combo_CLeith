//Create a simple narrative game where users make choices that determine the story's 
//progression. This involves string manipulation, conditional statements, and basic game logic.


import java.util.Scanner;

public class Choose_Own_Adventure {
static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the game! Please enter your name.");
		String username = input.next();
		System.out.println("Hi " + username + "! \nPlease select a color \nRed \nOrange \nYellow \nGreen \nBlue \nPurple");
		String color = input.next();
		switch(color)
		{
		case("red"):
			System.out.println("You chose red. \nPlease select an animal: \ncat \ndog \nfrog \nbear \nfish");
		
		}
		

	}

}
