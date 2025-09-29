import java.util.Random;
import java.util.Scanner;

public class Histogram {
	
static Scanner input = new Scanner(System.in);

	static Random rand = new Random();

	public static void main(String[] args) {
		int n = 10;
		countdown(n);

		int[] arr = new int[10];
		fillArray(arr);

		int sixties = 0;
		int seventies = 0;
		int eighties = 0;
		int ninties = 0;

		for (int num : arr) // enhanced array traversing array, doesn't have index
		{
			if (num > 89)
				ninties++;
			else if (num > 79)
				eighties++;
			else if (num > 69)
				seventies++;
			else
				sixties++;

		}
		System.out.printf("90s    80s    70s    60s\n%d      %d      %d      %d\n", ninties, eighties, seventies,
				sixties);

		int fibNum = fibonacci(n);
		String another = "y";
		while (another.equals("y"))
		{
		System.out.println("Enter the fib level you want to go to.");
		fibNum= input.nextInt();
		for (int i = 0; i < fibNum; i++) {
			System.out.print(fibonacci(i) + ", ");
			if(i % 7 == 0)System.out.println();
		}
		System.out.println("Again?");
		another = input.next();
		}

	}

	private static void countdown(int n) {
		// TODO Auto-generated method stub
		
	}

	private static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {// knows length of array, index
			arr[i] = rand.nextInt(40) + 60; // 40 long starting at 60

		}

	}

	private static int fibonacci(int n) {
		if (n < 1) {
			System.out.println("Please use positive integers only.");
			return 0;
		}
		if (n == 1 || n == 2)
			return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);

	}

}
