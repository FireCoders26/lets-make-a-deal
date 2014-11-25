package deal.games;

/*******************
 * Team: DragonArmy26
 * Author: Mathew Johnson
 * 
 ******************/
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

import deal.data.Player;
import deal.data.Prize;

public class TeamGame extends LetsMakeADealGame {
	// fields
	private Player player1;
	private Player player2;
	private Player leader1;
	private Player[] players = { player1, player2, leader1};
	private String[] oContainers = { "Curtain1", "Curtain2", "Curtain3",
			"Door1", "Door2", "Door3", "Big box", "Box" };
	private Random rand;
	private Scanner input;

	// ctors
	public TeamGame() {
		System.out.println("Initializing Team Game...");
		rand = new Random();
		input = new Scanner(System.in);
		System.out.println("Finished Initializing Team Game.");
	}

	/* Starts game on the console */
	@Override
	public void runGame() {
		// set up players
		System.out.println("Who wants to make a deal?\nWhat are your names:");
		System.out.print("Player1: ");
		player1 = new Player(input.nextLine());
		System.out.print("Player2: ");
		player2 = new Player(input.nextLine());

		players[0] = player1;
		players[1] = player2;

		// setup leader
		System.out.println("I am going to pick one of you to be the leader,\n"
				+ "the leader will be making all of the major decisions.");
		System.out.printf("Now, in my hand. I have two envelopes, one is silver colored and the other is golden colored. \n"
				+ "One of These envelopes contains a leader card. I am going to let %s choose which envelope you want.\n", player1.getName());
		String choice = input.nextLine();
		
		if(choice.equals("silver")){
			leader1 = player1;
		}
		else if(choice.equals("gold")){
			leader1 = player2;
		}
		System.out.printf("%s, you are now the leader. \n", leader1.getName());
		

		// setup prizes
		String container1;
		String container2;
		int c1Index = rand.nextInt(oContainers.length);
		int c2Index = rand.nextInt(oContainers.length);
		container1 = oContainers[c1Index];
		container2 = oContainers[c2Index];
		Prize prize1 = new Prize(container1);
		Prize prize2 = new Prize(container2);

		System.out.printf("Do you want whatever is inside of %s \n",
				prize1.getoName());
		System.out.printf(
				"Or, would you rather have whatever is inside of this %s?%n"
						+ "Remember, either one of these could be a ZONK!\n",
				prize2.getoName());

		
		
			
	}
}
