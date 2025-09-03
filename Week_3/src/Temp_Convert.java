import java.util.Scanner;

public class Temp_Convert {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		printInput(); //here we are calling a method with no parameters
		
			System.out.println("What is the temperature in F?");
			
			double fTemp = input.nextDouble(); //input for a floating point number double
			
			double cTemp = convertToC(fTemp);//calling method that returns a double and takes a double
			
			double kTemp = convertToK(cTemp);

			System.out.printf("%.2f°F converts to %.2f°C and %.2f°K%n" , fTemp, cTemp, kTemp);
	}

		private static void printInput() {
		
	}

		public static double convertToC(double fTemp)
		{
			return (fTemp - 32) * 5/9;	
		}
		public static double convertToK(double cTemp)
		{
			return cTemp + 273.15;
	}

}
