package dAndD;

public class Attributes {
	public int strength;
	public int health;
	public int intelligence;
	public int dexterity;
	public int faith;
	public int wisdom;
	public int charisma;
	
	public static Attributes Goblin()
	{
		Attributes result = new Attributes();
		result.strength = 5;
		result.health = 20;
		
		return result;
	}
}
