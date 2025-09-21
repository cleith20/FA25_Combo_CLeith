//Your task is to write a program that will read in the radius of a circle,
//and print out the diameter, circumference and area. Your program should 
//use a separate function for doing each calculation, and should use parameters
//and return values to pass information back and forth.

import java.util.Scanner;

public class Circle_Calculation {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle.");
		double radius = input.nextDouble();
		dCalc(radius);
		aCalc(radius);
		cCalc(radius);

	}

	private static double cCalc(double radius) {
		double circumference = 2 * Math.PI * radius;
		System.out.printf("The circumference is %.2f", circumference);
		return 0;
	}

	private static double aCalc(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		System.out.printf("The area is %.2f \n", area);
		return 0;
	}

	private static double dCalc(double radius) {
		double diameter = 2 * radius;
		System.out.printf("The diameter is %.2f \n", diameter);
		return 0;
	}

}
