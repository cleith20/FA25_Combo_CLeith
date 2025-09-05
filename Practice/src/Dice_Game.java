import java.util.Random;
import java.util.Scanner;

public class Dice_Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int die1;
		String another, answer;
		
		System.out.println("Do you want to roll the die?");
		another = input.nextLine();
		
		while (another.equals("y")) {
			die1 = new Random().nextInt(10);
			System.out.println(die1);
			System.out.println("Do you want to roll the die again?");
			another = input.nextLine();
			}
		System.out.println("Goodbye.");
		}		
	
	}


