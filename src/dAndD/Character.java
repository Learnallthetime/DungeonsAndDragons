package dAndD;

import java.util.ArrayList;

// The information that this class will hold will be...
// 1. Attributes, Method of damage,
public class Character {
	private int ID;
	public static int lastID = 0;
	
	public String name;
	public String type;
	public int strength;
	public int health;
	public int intelligence;
	public int dexterity;
	public int faith;
	public int wisdom;
	public int charisma;
	public boolean isEnemy;
	
	public Character(String name, int health, int strength, int intelligence, boolean isEnemy)
	{
		ID = ++lastID;
		this.health = health;
		this.strength = strength;
		this.name = name;
		this.isEnemy = isEnemy;
		this.intelligence = intelligence;
	
	}
	
	int getID()
	{
		return ID;
	}
	
	public void recieveDamage (int damage)
	{
		health = health - damage;
	}
	
	public void hit(Character enemy, int choice)
	{
		//TODO: generate random number here
		
		if(choice == 1){
			
			enemy.recieveDamage(strength);
			UI.print(name + " hits " + enemy.name + " with " + strength + " damage.");
		}
		else if(choice == 2){
			enemy.recieveDamage(intelligence);
			UI.print(name + " hits " + enemy.name + " with " + intelligence + " magic damage.");
		}
		else{
			//TODO: print error message or make retry loop
		}
		
		
		
	}
	
	public void magic(Character enemy)
	{
		enemy.recieveDamage(intelligence);
		UI.print(name + " hits " + enemy.name + " with " + intelligence + " magic damage.");
	}
	
	public void act(Battlefield field)
	{
		int choice;
		
		
		if (health < 1)
			return;
		
		ArrayList<Character> characters = field.getCombatans();
		Character result = null;
		for (Character c : characters)
		{
			if (c.isEnemy == this.isEnemy || c.health < 1)
				continue;
			
			if (result == null || c.health < result.health)
				result = c;
		}
		
		choice = UI.optionsList(" Choose your damage! ", new String[]{" Strength ", " Intelligence "} );
		
		if (result != null){
			hit(result);
		if (choice == 1){
			
			hit(result);
		}
		else if (choice == 2){
			magic(result);
		
		}
		
		}
			
	}
}
