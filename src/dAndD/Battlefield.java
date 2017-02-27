package dAndD;

import java.util.ArrayList;

public class Battlefield {
	public ArrayList<Character> combatants;

	public Battlefield(ArrayList<Character> combatants)
	{
		this.combatants = (ArrayList<Character>)combatants.clone();
	}

	public ArrayList<Character> getCombatans()
	{
		return combatants;
	}

	public void fight()
	{
		boolean enemyLeft = false; 
		boolean friendsLeft = false;

		do
		{
			for (Character c : combatants) {
				c.act(this);
			}
			
			UI.printTeam(combatants, false);
			UI.printTeam(combatants, true);

			enemyLeft = false; 
			friendsLeft = false;
			for (Character c : combatants) {
				if (c.isEnemy && c.attributes.health > 0)
					enemyLeft = true; 

				if (!c.isEnemy && c.attributes.health > 0)
					friendsLeft = true;
			}

		} while (enemyLeft && friendsLeft);

		if (friendsLeft)
			System.out.println("Your team has won this battle!");
		else
			System.out.println("YOU LOOSE!!!!");
	}
}
