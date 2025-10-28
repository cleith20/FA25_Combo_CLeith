
public class Dog extends Animal{
	private String breed;
	private String color;
	public Dog() {
		super(); //needs to call super so we have a height, weight and name
		breed ="none";
		color = "black";
	}
	public Dog(int height, double weight, String name, String breed, String color) {
		super(height, weight, name);
		this.color = color;
		this.breed = breed;
		
	}
	public String getBreed() {
		return breed;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String makeNoise()
	{
		return "Woof-woof-woof";
	}
	
	@Override
	public String toString() {
		return "Dog: " + super.getName() + "\nBreed: " + breed + "\nColor: " + color + "\nHeight: " + super.getHeight()
		+ "\nWeight: " + super.getWeight();
	}
	
	
	
}
