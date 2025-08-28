import java.util.Scanner;

public class CodingFlows {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String another = "y";
		int dailyTotal = 0;
		
		while (another.equals("y"))
		{
			int total = 0;
			System.out.println("How many credits are you taking?");
			int credits = input.nextInt();
			if (credits > 5) 
			{
				total += 250;
			}
			else
			{ 
				System.out.println("Would you like to participate in activities?");
				String fee = input.next();
				if (fee.equals("y"))
				{
					total += 250;
				}
			}
			total += credits * 560 + 650;
			dailyTotal += total;
			
			System.out.println("Your total is $" + total + ".");
			
			System.out.println("Is there another student?");
			
			another = input.next();
		}
		System.out.println("The daily total was $ " + dailyTotal + ".");
	}

}
