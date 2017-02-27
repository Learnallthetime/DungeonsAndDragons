package dAndD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
	public static void main(String [] args){

		String[] yesNo = {"Yes", "No"};
		int answer = UI.optionsList("Are you to play ready?", yesNo);
		if (answer == 2)
		{
			System.out.println("Come back when your ready to be challenged!");
			return;
		}
		
		System.out.println("Welcome to the D&D, may the Gods be with you...");	
		//System.out.println("Choose your character build");
		
		ArrayList<Character> characters = new ArrayList<Character>();
		characters.add(new Character("Ivan", Attributes.Goblin(), false));
		characters.add(new Character("Phil", Attributes.Goblin(), false));
		characters.add(new Character("Goblin 1", Attributes.Goblin(), true));
		characters.add(new Character("Goblin 2", Attributes.Goblin(), true));
		characters.add(new Character("Goblin 3", Attributes.Goblin(), true));
		characters.add(new Character("Goblin 4", Attributes.Goblin(), true));
		characters.add(new Character("Imperial Dragon Zombie", Attributes.Goblin(), true));
		Battlefield field = new Battlefield(characters);
		field.fight();
	}
}
