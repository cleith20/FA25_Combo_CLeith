//Write code for this problem. There are weather stations all over Fort Collins. The
//information is used to help create better simulations to predict the weather. Many of these are
//monitored by volunteers most are very good but everyone makes a mistake once in a while. Write
//Pseudo code that will take in precipitation from the 200 stations. The first three reports are from the
//paid weather reporters, these people are assumed to not make mistakes. Find the average for these
//three people first. If a volunteer is more than 25% greater or smaller than the average of the
//professionals, their number is thrown out because it is probably a mistake. Find the averages for the city.

//Numbers are randomized to simulate data

import java.util.Random;
import java.util.Scanner;

public class weather_stations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int goodCount = 3;

		double proAvg = 0;
		double proTotal = 0;
		double total = 0;
		double cityAvg = 0;

		for (int count = 1; count <= 200;) {
			System.out.println("What is the precipication of weather station " + count + "?");
			double precip = rand.nextDouble(20);
			System.out.println(precip);
			count++;
			if (count < 3) {
				proTotal += precip;
				proAvg = proTotal / 3;
			} else if (precip > (proAvg * .75) && precip < (proAvg * 1.25)) {
				total += precip;
				goodCount++;
			}
		}
		cityAvg = total / goodCount;
		System.out.println("The averages for the city are " + cityAvg + ".");

	}

}
