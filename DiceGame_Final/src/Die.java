import java.util.Random;

public class Die {
	private int numSides;
	private int value;

	public Die(int numSides) {
		this.numSides = numSides;
		this.value = 1;
	}

	public Die() {
		this.numSides = 6;
		this.value = -1;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static int Roll(int numSides) {
		int value = new Random().nextInt(numSides)+1;
		return value;
	}
	
}

