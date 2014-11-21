/*******************
 * Team: DragonArmy26
 * Author: Mathew Johnson
 * 
 ******************/
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class TeamGame {
	//fields
	Player Player1;
	Player Player2;
	Player[] players = {Player1, Player2};
	String[] oContainers = {"Curtain1", "Curtain2", "Curtain3", "Door1", "Door2", "Door3", "Big box", "Box"};
	Random rand = new Random();
	//ctors
	public TeamGame(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Who wants to make a deal?\n What are your names:");
		System.out.println("Player1: ");
		Player1 = new Player(input.nextLine());
		System.out.println("Player2: ");
		Player2 = new Player(input.nextLine());
		
		System.out.println("I am going to pick one of you to be the leader. The leader will be making all of the major decisions.");
		Player Leader;
		int lIndex = rand.nextInt(players.length); 
		Leader = players[lIndex];
		
		System.out.printf("%s is now the leader", Leader.getName());
		
		
		String container1;
		String container2;
		int c1Index = rand.nextInt(oContainers.length);
		int c2Index = rand.nextInt(oContainers.length);
		container1 = oContainers[c1Index];
		container2 = oContainers[c2Index];
		Prize prize1 = new Prize(container1);
		Prize prize2 = new Prize(container2);
		System.out.printf("do you want whatever is inside of this %s \n", prize1.getoName());
		System.out.printf("or do you want whatever is inside of this %s? Remember, either one of these could be a zonk!", prize2.getoName());
		
		
		String choice = input.nextLine();
		

		//switch(choice){
		//	case prize1.getoName():
				
				
		//}		
	}
}
