import java.util.Scanner;

public class GoFishDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Welcome to Go Fish!\n\nThe goal is to win the most \"books\" "
				+ "of cards. \nA book is any four of a kind, such as four kings, "
				+ "\nfour aces, and so on.\n\nPress Enter to Begin");
		input.nextLine();

		Fishing game = new Fishing();
		game.playGame();
	}

}
