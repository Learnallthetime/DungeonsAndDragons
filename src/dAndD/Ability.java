package dAndD;

public abstract class Ability {
	
	public final String name;
	
	public Ability(String name)
	{
		this.name = name;
	}
	
	public abstract void run(Character c, Battlefield b);
	public abstract boolean check(Character c, Battlefield b);	
}
