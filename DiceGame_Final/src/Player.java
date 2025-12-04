
public class Player {
	private String name;
	private Die totalDice;
	
	
	public Player(String name, Die totalDice) {
		super();
		this.name = name;
		this.totalDice = totalDice;
	}
	
	public Player() {
		this.name = "none";
		this.totalDice = new Die(-1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Die getTotalDice() {
		return totalDice;
	}

	public void setTotalDice(Die totalDice) {
		this.totalDice = totalDice;
	}
	
	
	
}
