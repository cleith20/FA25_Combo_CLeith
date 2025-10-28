//boolean longhair and bobtail


public class Cat extends Animal{
	private boolean longhair;
	private boolean bobtail;
	public Cat() {
		super();
		longhair = true;
		bobtail = true;
	}
	public Cat(int height, double weight, String name, boolean longhair, boolean bobtail) {
		super(height, weight, name);
		this.bobtail = bobtail;
		this.longhair = longhair;
	}
	public boolean isLonghair() {
		return longhair;
	}
	public boolean isBobtail() {
		return bobtail;
	}
	@Override
	public String makeNoise()
	{
		return "Meow-meow-meow";
	}
	@Override
	public String toString() {
		return "Cat: " + super.getName() + "\nLonghair: " + longhair + "\nBobtail: " + bobtail + "\nHeight: " + super.getHeight()
		+ "\nWeight: " + super.getWeight();
	}
	
	
}
