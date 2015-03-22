import java.util.Scanner;
public class GameRockPaperScissors {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);		
		
		int endGame;
		String player1Choice = "", player2Choice = "";
		//iterative statement to loop until they don't want to play again.
		do
		{			
			//prompt player 1 to enter their choices
			System.out.print("Player 1, please enter \"R/r\" for Rock, \"P/p\" for Paper, and \"S/s\" for Scissors: ");
			player1Choice = input.next();
						
			System.out.print("Player 2, please enter \"R/r\" for Rock, \"P/p\" for Paper, and \"S/s\" for Scissors: ");
			player2Choice = input.next();
		
			//conditional statements
			if(player1Choice.equalsIgnoreCase(player2Choice))
			{
				System.out.println("You are tie!!");			
			}
			else if(player1Choice.equalsIgnoreCase("R") & (player2Choice.equalsIgnoreCase("P")) )
			{
				System.out.println("Paper eats Rock! Player 2 win");		
			}
			else if(player1Choice.equalsIgnoreCase("R") & (player2Choice.equalsIgnoreCase("S")) )
			{
				System.out.println("Rock crushes scissors! Player 1 win");
			}			
			else if(player1Choice.equalsIgnoreCase("P") & (player2Choice.equalsIgnoreCase("R")))
			{
				System.out.println("Paper eats Rock! Player 1 win");
			}
			else if(player1Choice.equalsIgnoreCase("P") & (player2Choice.equalsIgnoreCase("S")))
			{
				System.out.println("Scissrors cut Paper! Player 2 win");
			}
			else if(player1Choice.equalsIgnoreCase("S") & (player2Choice.equalsIgnoreCase("R")))
			{
				System.out.println("Rock crushes scissors! Player 2 win");
			}
			else if(player1Choice.equalsIgnoreCase("S") & (player2Choice.equalsIgnoreCase("P")))
			{
				System.out.println("Scissrors cut Paper! Player 1 win");
			}
			
			//prompt user to Enter 0 to end game
			System.out.print("Continuer to Play? Press any number \nOr enter 0 to end game: ");
			endGame = input.nextInt();
		}while(endGame != 0);
		System.out.println("Thanks for playing!!!");
		
		//closing input
		input.close();
	}

}

// Good job
