public class Bookwork {

	
	public static void main(String[] args) {
		System.out.println("Hello");
		newLine();
		System.out.println("Beautiful");
		threeLines();
		System.out.println("World!");
		
		print("Hello World!");
		printN("Hello", 3);
		
		int hour = 9;
		int min = 28;
		
		printTime(hour, min);
		
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		
		System.out.printf("%.2f" , root);
		newLine();
		System.out.printf("%.2f" , height);
		newLine();
		System.out.printf("%.2f" , Math.toDegrees(Math.PI));
		newLine();
		System.out.printf("%.2f" , Math.cos(angle + Math.PI / 2));
		newLine();
		
		String name = "Cam";
		String starName = starFiller(name);
		
		print(starName);
		
	}
	private static String starFiller(String name) {
		String ret = "";
		for(int i = 0; i < name.length(); i++)
			ret += "*"  + name.charAt(i);
		ret += "*";
		return ret;
	}
	private static void printTime(int hour, int min) {
		System.out.print(hour);
		System.out.print(":");
		System.out.println(min);
	}
	private static void printN(String s, int num) {
		for(int i = 0; i < num; i++)
		{
			System.out.println(s);
		}
	}
	private static void print(String s) {
		System.out.println(s);
		
	}
	private static void threeLines() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	private static void newLine()
	{
		System.out.println();
	}

}
