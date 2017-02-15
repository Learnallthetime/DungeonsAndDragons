// The information that this class will hold will be...
// 1. Attributes, Method of damage,
public class Character {
	private int ID;
	public static int lastID = 0;
	
	public String name;
	public int strength;
	public int health;
	
	public Character(String name)
	{
		ID = ++lastID;
		health = 10;
		strength = 3
		this.name = name;
	}
	
	int getID()
	{
		return ID;
	}
	
	public void recieveDamage (int damage)
	{
		health = health - damage;
	}
	
	public void hit(Character enemy)
	{
		enemy.recieveDamage(strength);
	}
	
	System.out.println(health)

}
