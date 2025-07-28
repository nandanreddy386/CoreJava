package rock_paper_scissor;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {

	public static void main(String[] args) 
	{
		String[] computerchoices = {"rock","paper","scissor"};
		String play = "yes";
		Scanner sc = new Scanner(System.in);
		while(play.equalsIgnoreCase("yes"))
		{
			Random Rand = new Random();
			String computerchoice = computerchoices[Rand.nextInt(3)];
			System.out.println("Enter your choice(rock/paper/scissor):");
			String playerchoice = sc.nextLine().toLowerCase();
			
			System.out.println("computer chose : " + computerchoice);
			if(playerchoice.equals(computerchoice))
			{
				System.out.println("it is a tie");
			}
			else if((playerchoice.equals("rock")&&computerchoice.equals("scissor"))||
					(playerchoice.equals("paper")&&computerchoice.equals("rock"))||
					(playerchoice.equals("scissor")&&computerchoice.equals("paper")))
			{
				System.out.println("congrats! you won the game");
			}
			else if((playerchoice.equals("rock")||(playerchoice.equals("paper"))||(playerchoice.equals("scissor"))))
			{
				System.out.println("computer won the game");
			}
			else
			{
				System.out.println("Invalid Input! enter input among(rock,paper,scissor)");
			}
			System.out.println("Do you want to play again(yes/no):");
			
			play=sc.nextLine();
		}
		System.out.println("Thanks For playing have a great day");
		sc.close();
		
		

	}

}
