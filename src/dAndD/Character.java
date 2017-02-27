package dAndD;

import java.util.ArrayList;

// The information that this class will hold will be...
// 1. Attributes, Method of damage,
public class Character {
	private int ID;
	public static int lastID = 0;
	
	public String name;
	public String type;
	public Attributes attributes;
	public boolean isEnemy;
	
	public Character(String name, Attributes attributes, boolean isEnemy)
	{
		if (attributes == null)
			throw new RuntimeException("Character needs attributes: " + name);
		
		ID = ++lastID;
		this.attributes = attributes;
		this.name = name;
		this.isEnemy = isEnemy;
	}
	
	int getID()
	{
		return ID;
	}
	
	public void recieveDamage (int damage)
	{
		attributes.health = attributes.health - damage;
	}
	
	public void hit(Character enemy)
	{

			enemy.recieveDamage(attributes.strength);
			UI.print(name + " hits " + enemy.name + " with " + attributes.strength + " damage.");

		
	}
	
	public void magic(Character enemy)
	{
		enemy.recieveDamage(attributes.intelligence);
		UI.print(name + " hits " + enemy.name + " with " + attributes.intelligence + " magic damage.");
	}
	
	public void act(Battlefield field)
	{
		int choice;
		
		
		if (attributes.health < 1)
			return;
		
		ArrayList<Character> characters = field.getCombatans();
		Character result = null;
		for (Character c : characters)
		{
			if (c.isEnemy == this.isEnemy || c.attributes.health < 1)
				continue;
			
			if (result == null || c.attributes.health < result.attributes.health)
				result = c;
		}
		

			hit(result);
	}
}
