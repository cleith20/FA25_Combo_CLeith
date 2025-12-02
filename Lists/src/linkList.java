//stack is first in, last out
//queue is last in, last out, like a normal line

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		var nums = new ArrayList<Integer>(); // must use wrapper classes, Integer not int
		// var = variable

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		System.out.println(nums);

		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Chevy");

		System.out.println(cars);
		System.out.println(cars.get(4));
		cars.set(0, "Subaru");
//		System.out.println(cars);
//		cars.removeLast();
//		System.out.println(cars);
//		cars.clear();
//		System.out.println(cars);

		Collections.sort(cars);
		System.out.println(cars);

		/***********************************/
		// LinkedList
		List<String> animals = new LinkedList<String>();

		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		animals.add("bunny");
		animals.add("fish");

		System.out.println(animals);
		Collections.sort(animals, Collections.reverseOrder()); //reversed sort
		System.out.println(animals);

	}

}
