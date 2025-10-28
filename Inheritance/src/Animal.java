
public class Animal {
	private int height;
	private double weight;
	private String name;
	
	
	public Animal() {
		this.height = 0;
		this.weight = 0.0;
		this.name = "none";
	}
	public Animal(int height, double weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	
	public String makeNoise()
	{
		return "Blah-blah-blah";
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nHeight: " + height + "\nWeight: " + weight ;
	}
	
	
	
	
}
