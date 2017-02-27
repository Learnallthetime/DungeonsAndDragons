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
		characters.add(new Character("Ivan", 100, 8, 20, false));
		characters.add(new Character("Phil", 100, 8, 50, false));
		characters.add(new Character("Goblin 1", 5, 1, 0, true));
		characters.add(new Character("Goblin 2", 5, 1, 0, true));
		characters.add(new Character("Goblin 3", 5, 1, 0, true));
		characters.add(new Character("Goblin 4", 5, 1, 0, true));
		characters.add(new Character("Imperial Dragon Zombie", 150, 10, 70, true));
		Battlefield field = new Battlefield(characters);
		field.fight();
	}
}
