import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hwFileIO {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;

		System.out.println("What is the file you would like to work with?");
		String fileName = input.next();
		input.nextLine();

		File items = createFile(fileName);
		String sSum = readFile(items, sum);
		File total = createFile("total.txt");
		double dSum = Double.parseDouble(sSum);
		writeFile("total.txt", dSum);

//		System.out.println("What do you want to write to the file?");
//		double value = input.nextDouble();
//		writeFile(fileName,value);

//		System.out.println("What do you want to append to the file?"); //to add more values
//		String str2 = input.nextLine();
//		appendTo(fileName, str2);

	}

	private static String readFile(File myFile, double sum) {
		try (Scanner myReader = new Scanner(myFile)) {
			while (myReader.hasNextDouble()) {
				try {
					double value = myReader.nextDouble();
					sum += value;
				} catch (NumberFormatException e) {
					System.err.println("Skip");
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("There was an error writing the file.");
			e.printStackTrace();
		}
		String sSum = String.format("%.2f", sum);
		System.out.printf(sSum);
		return sSum;
	}

	private static void appendTo(String fileName, String str2) {
		try {
			FileWriter myWriter = new FileWriter(fileName, true);
			myWriter.write("\n");
			myWriter.write(str2);
			myWriter.close();
			System.out.println("Appended successfully.");
		} catch (IOException e) {
			System.out.println("There was an error writing the file.");
			e.printStackTrace();
		}

	}

	private static void writeFile(String name, double value) {
		try {
			FileWriter myWriter = new FileWriter(name);
			double tax = value * 0.053;
			double total = tax + value;
			String sTotal = String.format("%.2f", total);
			String sTax = String.format("%.2f", tax);
			myWriter.write("Subtotal: " + Double.toString(value));
			myWriter.write("\nTax: " + sTax);
			myWriter.write("\nTotal: " + sTotal);
			myWriter.close();
			System.out.println("Written successfully.");
		} catch (IOException e) {
			System.out.println("There was an error writing the file.");
			e.printStackTrace();
		}

	}

	private static File createFile(String fileName) {
		try {
			File myFile = new File(fileName);
			if (myFile.createNewFile()) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("\nFile " + myFile.getName() + " already exists.");
			}
			return myFile;
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
		return null;
	}

}
