
public class InClassLoops {

	public static void main(String[] args) {
		// sum of the first 10 natural numbers with a for loop

//		int count = 0;
//		for (int i = 0; i < 10; i++) {
//			count += i;
//		}
//		System.out.println(count);

		int term = 10;
		ForFibonacci(term);

		int rows = 10;
		rightTri(rows);
		equalTri(rows);

	}

	private static void equalTri(int rows) {
		for (int i = 1; i < rows+1; i++) {
			
			for (int j = 0; j < rows -i;j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	private static void rightTri(int rows) {
		for (int i = 0; i < rows+1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	private static void ForFibonacci(int term) {
		if (term < 1) {
			System.out.println("Please use positive integers only.");
			return;
		}
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.printf("Fibonacci sequence up to %d terms ", term);
		if (term == 1) {
			System.out.print(firstTerm);
			return;
		}
		System.out.println(firstTerm + ", " + secondTerm);
		for (int i = 2; i < term; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(nextTerm + " ");

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
