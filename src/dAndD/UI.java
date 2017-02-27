package dAndD;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	public static int optionsList(String title, String[] options)
	{
		Scanner kbd = new Scanner(System.in);
		int result = 0;

		do
		{
			System.out.println(title);
			for (int i = 0; i < options.length; i++)
				System.out.println(i+1+ ". " + options[i]);

			String input = kbd.nextLine();
			try
			{
				result = Integer.parseInt(input);
			}
			catch (NumberFormatException ex)
			{
			}
		}
		while (result < 1 || result > options.length);

		return result;
	}

	public static void printTeam(ArrayList<Character> characters, boolean isEnemy)
	{
		if (isEnemy)
			System.out.println("Enemies");
		else
			System.out.println("Characters");
		for (Character c : characters)
		{
			if (c.isEnemy != isEnemy)
				continue; 

			System.out.println(c.name + " HP: " + c.health + " Str: " + c.strength + " Magic: " + c.intelligence);
		}
	}
	
	public static void print (String text)
	{
		System.out.println(text);
	}
}
