import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is the file you would like to work with?");
		String fileName = input.next();
		input.nextLine();

		File myFile = createFile(fileName);
		 System.out.println("But that's alright!");
		System.out.println("What do you want to write to the file?");
		String str = input.nextLine();
		writeFile(fileName,str);
		
		System.out.println("What do you want to append to the file?");
		String str2 = input.nextLine();
		appendTo(fileName, str2);

		readFile(myFile);

		
		deleteFile(myFile);
	}

	private static void deleteFile(File myFile) {
		if(myFile.delete())
		{
			System.out.println(myFile.getName() + " was deleted successfully.");
		}
		else
		{
			System.out.println("Failed to delete " + myFile.getName());
		}
		
	}

	private static void readFile(File myFile) {
		try (Scanner myReader = new Scanner(myFile)) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("There was an error writing the file.");
			e.printStackTrace();
		}
	}

	private static void appendTo(String fileName, String str2) {
		try {
			FileWriter myWriter = new FileWriter(fileName, true); // true makes it append and not overwrite like blank
																	// and false;
			myWriter.write("\n");
			myWriter.write(str2);
			myWriter.close();
			System.out.println("Appended successfully.");
		} catch (IOException e) {
			System.out.println("There was an error writing the file.");
			e.printStackTrace();
		}

	}

	private static void writeFile(String name, String strToWrite) {
		try {
			FileWriter myWriter = new FileWriter(name);
			myWriter.write(strToWrite);
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
			if (myFile.createNewFile())// surround with try/catch
			{
				System.out.println("File created successfully.");
			} else {
				System.out.println("File " + myFile.getName() + " already exists.");
			}
			return myFile;
		} catch (IOException e) {
			System.out.println("An error occurred.");
			// the catch catches an error and prevents it from messing with the compiler
			// e.printStackTrace();
		}
		return null;
	}

}
