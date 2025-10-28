//animal is parent class
//dog is child class

public class Farm {

	public static void main(String[] args) {
		Animal[] farm = new Animal[3];

		farm[0] = new Animal(66, 24, "Mochi");
		farm[1] = new Dog(71, 69.9, "Tula", "Boxer", "Brown & White"); // dog has everything animal has
		farm[2] = new Cat(30, 11.7, "Mei", false, true); // but animal doesn't have everything dog has

		for (Animal ani : farm) {
			System.out.println(ani);
			System.out.println(ani.makeNoise());
			System.out.println();
		}

//		System.out.println(ani);
//		System.out.println();
//		System.out.println(dog);
//		System.out.println(dog.makeNoise());
//		System.out.println();
//		System.out.println(cat);
//		System.out.println(cat.makeNoise());
	}
}
