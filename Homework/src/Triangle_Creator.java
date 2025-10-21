//Cameron Leith

import java.util.Scanner;

public class Triangle_Creator {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = 0;
		char userFill;
		String answer = "y";
		while (answer.equals("y")) { // while loop to repeat triangle creator until user's done
			System.out.print("Enter size: ");
			rows = input.nextInt();
			while (rows < 1 || rows > 50) { // while loop to ensure the size stays within parameters
				System.out.println("Size must be between 1-50!");
				System.out.print("Enter size: ");
				rows = input.nextInt();
			}
			System.out.print("Enter fill: ");
			userFill = input.next().charAt(0);
			equalTri(rows, userFill);
			System.out.println("Would you like another triangle? (y/n)");
			answer = input.next();
		}
		System.out.println("Goodbye.");
	}

	private static void equalTri(int rows, char userFill) { // method to print the equilateral triangle
		for (int i = 0; i < rows + 1; i++) {

			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(userFill + " "); // inputs user's fill to create triangle,
			} // space moves each fill over to an even space
			System.out.println();

		}

	}

}
