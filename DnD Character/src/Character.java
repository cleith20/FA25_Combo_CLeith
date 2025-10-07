
public class Character {
	private int health;
	private String name;
	private int power;
	private int armor;
	private Weapon weapon;
	
	public Character() { //right click, source, generate constructor using fields; now have data type that has 3 ints and a string
		super();
		this.health = 0;
		this.name = ""; //deleted everything and now it is a default constructor
		this.power = 0;
		this.armor = 0;
	}
	
	
		
	public Character(int health, String name, int power, int armor, String wName, int wDamage) {
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
		this.weapon = new Weapon(wName, wDamage);
	}
	
	public Weapon getWeapon()
	{
		return weapon;
	}
	public void setWeapon(String name, int damage)
	{
		this.weapon = new Weapon(name, damage);
	}



	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public Character(int health, String name, int power, int armor) { //right click, source, generate constructor using fields; now have data type that has 3 ints and a string
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
	}

	@Override  //override the toString method for the object
	public String toString() {
		return "Character " + name + "\nHP: " + health + 
				"\nPower: " + power + "\nAC: " + armor + "\nWeapon: " + weapon;
	}
	
	
 
}
