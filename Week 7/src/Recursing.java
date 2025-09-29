
public class Recursing {

	public static void main(String[] args) {
		int n = 10;
		countdown(n);
		int factN = factorial(n);
		for (int i = 0; i < n; i++) {
			System.out.println(factorial(i));
		}
		
	}

	private static int factorial(int n) {
		if(n == 0) return 1;
		int recurse = factorial(n-1);//base case: when the looping stops, can be more than 1
		int result = n*recurse;
		return result;
	}

	private static void countdown(int n) {
		if(n == 0) {
			System.out.println("Blastoff!");
		}
		else {
			System.out.println(n);
			countdown(n-1);
		}
		
	}

}
