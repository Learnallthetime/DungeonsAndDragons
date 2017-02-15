import java.util.Scanner;


class d1 {
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



	public static void main(String [] args){

		String[] yesNo = {"Yes", "No"};
		int answer = optionsList("Are you to play ready?", yesNo);
		if (answer == 2)
		{
			System.out.println("Come back when your ready to be challenged!");
			return;
		}
		
		System.out.println("Welcome to the D&D, may the Gods be with you...");	
		System.out.println("Choose your character build"); 
		
				 

	}
}



