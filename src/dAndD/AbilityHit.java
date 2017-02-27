package dAndD;

public class AbilityHit extends Ability
{
	private Character enemy = null;
	
	public AbilityHit() 
	{
		super("Hit");
	}

	public void run(Character c, Battlefield b) {
		enemy.recieveDamage(c.strength);
		UI.print(name + " hits " + enemy.name + " with " + c.strength + " damage.");
	}

	public void magic(Character c, Battlefield b){
		enemy.recieveDamage(c.intelligence);
	UI.print(name + " hits " + enemy.name + " with " + c.intelligence + " magic damage.");
	}
	
	public boolean check(Character c, Battlefield b) {
		return enemy != null;
	}

}