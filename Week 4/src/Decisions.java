import java.util.Scanner;

public class Decisions {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// x == y -> does x equal y
		// x != y -> is x not equal y
		// x > y -> is x greater than y
		// x < y -> is x less than y
		// x >= y
		// x <= y
		
		
		int x = 10;
		if(x % 2 == 0)
		{
			System.out.println("x is even");
		}else
		{
			System.out.println("x is odd");
		}
	
		if(x > 0)
		{
			System.out.println("x is positive");
		}else if (x < 0)
		{
			System.out.println("x is negative");
		}else
		{
			System.out.println("x is zero");
		}
		
		System.out.println("Enter a num from 1 to 4");
		int num = input.nextInt();
		
		if(num == 1)
		{
			System.out.println("one");
		}
		if(num == 2)
		{
			System.out.println("two");
		}
		if(num == 3)
		{
			System.out.println("three");
		}
		if(num == 4)
		{
			System.out.println("four");
		}
		switch(num)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
	}
		System.out.println("Select a food: apple, banana, cherry, broccoli, carrot, or peas.");
		String food = input.next();
		
		switch(food)
		{
			case("apple"):
			case("banana"):
			case("cherry"):
				System.out.println("Fruit!");
				break;
			case("broccoli"):
			case("carrot"):
			case("peas"):
				System.out.println("Veggie!");
				break;
		}
		
		System.out.println("Pick a number");
		int x1 = input.nextInt();
		if(x1 > 0 && x1 < 10); // num 1-9
			System.out.println("You are in range");
		//x < 0 || x > 10 any not 1-9
		//!(x > 0) any negative num
		x1 = 4;
		int y = 0;
		
		if(x1 == 0)
		{
			if(y == 0)
			{
				System.out.println("Both x and y are zero");
			}
		}
			if(x1 == 0 && y == 0) System.out.println("Both are zero");
			if(x1 == 0 || y == 0) System.out.println("At least one is zero");
			
			//!(a && b) is the same as (!a || !b)
			//!(a || b) is the same as (!a && !b)
			// && (and) go before || (or)
	
			
			boolean flag;
			flag = true;
			
			System.out.println(isSingleDigit(9));
			int userNum = getNum();
			while(!isSingleDigit(userNum))
			{
				System.out.println("Not a single digit! Try again!");
				userNum = getNum();
			}
			System.out.println("Great job following instructions!");
			
			
			
	}
		
	private static int getNum() {
		System.out.println("Enter a single digit number.");
		int userNum = input.nextInt();
		return 0;
	}

	public static boolean isSingleDigit(int num)
	{
		return num > -10 && num < 10;
	}

	
}
	

	


