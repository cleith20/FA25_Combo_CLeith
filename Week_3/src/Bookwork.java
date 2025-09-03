import java.util.Scanner;

public class Bookwork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println();
//		
//		System.out.println("Type something:");
//		String word = input.next(); //next looks for a space and stops, putting the next word in cache, causes a buffer
//		System.out.println(word);
//		input.nextLine(); //clears the cache/buffer
//		System.out.println("Type something:");
//		String words = input.nextLine(); //next line is looking for the return character, using the cache
//		System.out.println(words);
		
		
//		final double CM_PER_INCH = 2.54; //constant, can't be changed later bc final, created variable
//		int inch = 100;
//		double cm = inch * CM_PER_INCH;
		
//		System.out.println("How many inches?");
//		inch = input.nextInt();
//		
//		cm = inch * CM_PER_INCH;
//		
//		System.out.print(inch + " in = ");
//		System.out.println(cm + " cm");
//	
//		System.out.printf("Four thirds = %.3f\n" , 4.0/3);
//		System.out.printf("%d in = %.2f cm\n" , inch , cm);
//		
//		String num = "73";
//		double pi = 3.14;
//		
//		System.out.println(Integer.parseInt(num) + pi);
//		
//		int feet = 76/12;
//		int inches = 76%12;
//		
//		System.out.println(feet + "'" + inches + "\"");
		
		double cm;
		int feet , inches , remainder;
		final int IN_PER_FOOT = 12;
		final double CM_PER_INCH = 2.54;
		
		System.out.println("Exactly how many centimeters?");
		cm = input.nextDouble();
		inches = (int)(cm/CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		
		System.out.printf("%.2f cm is %d feet and %d inches\n" , cm , feet , remainder);
		
//		use too many + you can get a stack overflow which is taking all the heap
		
		
		
		
	}

}
