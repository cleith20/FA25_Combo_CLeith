//arrays can store other arrays, strings, etc 

import java.util.Arrays;
import java.util.Random;

public class ArrayPlay {

	public static void main(String[] args) {
		int[] counts = { 1, 5, 97, 56 }; // name usually plural
		double[] values;
		String words[] = { "Hello", "World", "Goodbye", "Cruel", "Big", "Bad", "Contenious" };
		
		int index = findWord(words, "big");
		
		System.out.printf("found %s at index %d %n", words[index], index);

		words[index] ="Bigger";
		
		values = new double[10];
		for (int i = 0; i < values.length; i++) { // fills in the array
			values[i] = i;
		}
		System.out.println(values); // prints memory address of array, not actual values
		System.out.println(Arrays.toString(values));

		double[] newVals = values; // this is a copy of the data

		for (int i = 0; i < newVals.length; i++) {
			System.out.println(newVals[i]);
		}

		System.out.println(counts[2]); // counts.length doesn't need parentheses at the end because the count is
										// pre-deteremined unlike the string.length();

		counts[2] = 0;
		System.out.println(counts[2]);

		counts[3] -= 25;
		System.out.println(counts[3]);

		System.out.printf("%s %s %d", words[0], words[1], counts[3]);
		
		

		words[3] += words[0];
		System.out.println(words[3].charAt(9));

		int[] randoms = createRandArr(10);
		printArray(randoms);
		int average = arrAvg(randoms);
		System.out.printf("The average of these numbers is %d. %n", average);
		System.out.println();

		// the enhanced for loop
		for (int num : randoms) {
			System.out.printf("%d, ", num);
		}
		for (String word : words) {
			System.out.printf("%s, ", word);
		}
	}

	private static int arrAvg(int[] randoms) {
		int total = 0;
		for (int i = 0; i < randoms.length; i++) {
			total += randoms[i];

		}
		return total / randoms.length;
	}

	private static void printArray(int[] randoms) {
		for (int i = 0; i < randoms.length; i++) {
			System.out.printf("Index %d is %d. %n", i, randoms[i]);
		}

	}

	private static int[] createRandArr(int size) {
		Random rand = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 100;
		}
		return arr;
	}


	private static int findWord(String[] words, String target) {
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(target))return i;
		}
		return 0;
	}

}
