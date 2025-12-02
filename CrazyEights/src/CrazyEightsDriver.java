import java.util.Scanner;

public class CrazyEightsDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Welcome to Crazy Eights!\n\nThe goal is to be the first player to get "
				+ "rid of all the cards in your hand.\nThe player who is the first to "
				+ "have no cards left wins the game. \nThe winning player collects from "
				+ "each other player the value of the cards \nremaining in that player’s hand as follows:\r\n"
				+ "\nEach Eight = 50 points\r\n"
				+ "Each K, Q, J or 10 = 10 points\r\n"
				+ "Each Ace = 1 point\r\n"
				+ "Each other card is the rank value"
				+ "\n\nPress Enter to Begin");
		input.nextLine();
	
			Eights game = new Eights();
			game.playGame();
		}

}
