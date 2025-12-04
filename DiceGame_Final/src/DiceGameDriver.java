import java.util.ArrayList;
import java.util.Scanner;

public class DiceGameDriver {
public static Scanner input = new Scanner(System.in);
private ArrayList<Player>players;

	public static void main(String[] args) {
		System.out.println("How many dice will be rolled?");
		int numDie = input.nextInt();
		System.out.println("How many sides do you want on the die?");
		int numSides = input.nextInt();
		System.out.println("How many players?");
		int numPlayers = input.nextInt();
		
		for(int j = 1; j < numPlayers+1;j++)
		{
			int sum = 0;
		for(int i = 0; i < numDie; i++) {
			sum+= Die.Roll(numSides);
		}
		System.out.println("Player " + j + " rolled a total of "+ sum + " on " + numDie +" different " + numSides +" sided die.");
		}

	}

}
