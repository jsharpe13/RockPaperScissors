package dmacc.model;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void setComputerPlayerToRandom() {

		Random rand = new Random();
		
		int num = rand.nextInt(5)+1;
		//1-rock
		//2-paper
		//3-scissors
		//4-lizard
		//5-spock
		
		if(num==1)
		{
			computerPlayer = "rock";
		}
		else if(num==2)
		{
			computerPlayer = "paper";
		}
		else if(num==3)
		{
			computerPlayer = "scissors";
		}
		else if(num==4)
		{
			computerPlayer = "lizard";
		}
		else if(num==5)
		{
			computerPlayer = "spock";
		}
		
		
	}

	private void determineWinner() {
		
		if(player1.equals("rock"))
		{
			if(computerPlayer.equals("rock"))
			{
				winner = "a draw";
			}
			else if(computerPlayer.equals("paper") || computerPlayer.equals("spock"))
			{
				winner = "the computer";
			}
			else
			{
				winner = "player 1";
			}
		}
		else if(player1.equals("paper"))
		{
			if(computerPlayer.equals("paper"))
			{
				winner = "a draw";
			}
			else if(computerPlayer.equals("scissors") || computerPlayer.equals("lizard"))
			{
				winner = "the computer";
			}
			else
			{
				winner = "player 1";
			}
		}
		else if(player1.equals("scissors"))
		{
			if(computerPlayer.equals("scissors"))
			{
				winner = "a draw";
			}
			else if(computerPlayer.equals("spock") || computerPlayer.equals("rock"))
			{
				winner = "the computer";
			}
			else
			{
				winner = "player 1";
			}
		}
		else if(player1.equals("lizard"))
		{
			if(computerPlayer.equals("lizard"))
			{
				winner = "a draw";
			}
			else if(computerPlayer.equals("rock") || computerPlayer.equals("scissors"))
			{
				winner = "the computer";
			}
			else
			{
				winner = "player 1";
			}
		}
		else if(player1.equals("spock"))
		{
			if(computerPlayer.equals("spock"))
			{
				winner = "a draw";
			}
			else if(computerPlayer.equals("lizard") || computerPlayer.equals("paper"))
			{
				winner = "the computer";
			}
			else
			{
				winner = "player 1";
			}
		}
		
	}
	
}
