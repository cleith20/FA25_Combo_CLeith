//The goal of this exercise is to practice encapsulation
//and generalization using some of the examples in previous chapters.
//Starting with the code in Section 7.5, write a method called
//powArray that takes a double array, a, and returns a new array 
//that contains the elements of a squared. Generalize it to take a 
//second argument and raise the elements of a to the given power.
//
//Starting with the code in Section 7.8, write a method called 
//histogram that takes an int array of scores from 0 to (but not including) 100,
//and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.

import java.util.Arrays;
import java.util.Random;

public class Exercise9 {

	static Random rand = new Random();

	public static void main(String[] args) {
//		pt 1
		double[] array = { 3.14, 5.5, 9.7, 25.9 };
		int power = rand.nextInt(5);
		// converts array to a string
		System.out.println("The power used is " + power);
		System.out.println(Arrays.toString(powArray(array, power)));

//      pt2
		int[] scores = randomArray(30);
		int a = inRange(scores, 90, 100);
		int b = inRange(scores, 80, 90);
		int c = inRange(scores, 70, 80);
		int d = inRange(scores, 60, 70);
		int f = inRange(scores, 0, 60);
	}

	private static int[] randomArray(int size) {
		Random random = new Random();
		int[] ranScores = new int[size];
		for (int i = 0; i < ranScores.length; i++) {
			ranScores[i] = random.nextInt(100);
		}
		return ranScores;
	}

	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] < high) {
				count++;
			}
		}
		return count;
	}

//	pt1
	private static double[] powArray(double[] array, int power) {
		double[] array2 = new double[array.length];
		double total = 0.0;
		for (int i = 0; i < array.length; i++) {
			array2[i] = Math.pow(array[i], power);
		}
		return array2;

	}
}
