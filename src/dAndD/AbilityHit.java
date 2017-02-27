package dAndD;

public class AbilityHit extends Ability
{
	private Character enemy = null;
	
	public AbilityHit() 
	{
		super("Hit");
	}

	public void run(Character c, Battlefield b) {
		enemy.recieveDamage(c.attributes.strength);
		UI.print(name + " hits " + enemy.name + " with " + c.attributes.strength + " damage.");
	}

	public boolean check(Character c, Battlefield b) {
		return enemy != null;
	}

}