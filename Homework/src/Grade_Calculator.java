import java.util.Scanner;

public class Grade_Calculator {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double grade = 0;
		System.out.println("Please enter your grade: ");
		grade = input.nextDouble();
		if(grade >= 92) {
			System.out.println("Your grade is A");
		}
		else if(grade < 92 && grade >= 89 )
			System.out.println("Your grade is A-");
		else if(grade < 89 && grade >= 87 )
			System.out.println("Your grade is B+");
		else if(grade < 87 && grade >= 82 )
			System.out.println("Your grade is B");
		else if(grade < 82 && grade >= 79 )
			System.out.println("Your grade is B-");
		else if(grade < 79 && grade >= 77 )
			System.out.println("Your grade is C+");
		else if(grade < 77 && grade >= 72 )
			System.out.println("Your grade is C");
		else if(grade < 72 && grade >= 69 )
			System.out.println("Your grade is C-");
		else if(grade < 69 && grade >= 67 )
			System.out.println("Your grade is D+");
		else if(grade < 67 && grade >= 60 )
			System.out.println("Your grade is D");
		else if(grade < 60 && grade >= 0 )
			System.out.println("Your grade is F");
		else if(grade < 0 )
			System.out.println("Error");
		}
	
	}



