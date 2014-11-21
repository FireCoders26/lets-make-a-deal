/*******************
 * Team: DragonArmy26
 * Author: Hyrum Smith
 * 
 * 
 ******************/
import java.util.Scanner;
import java.util.Random;

public class GameEnvelope {
	//fields
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	  //Game Objects
	String[] pContainers = {"magazine", "envelope"};
	int randN;
	
	  //players
	Player player1;
	Player player2;
	Player player3;
	
	//ctor
	public GameEnvelope(){
		System.out.println("hello - commit test");
	System.out.print("Who wants to make a deal?\n What is your beautiful name:");
	player1 = new Player(input.nextLine());
	
	randN = rand.nextInt(pContainers.length);
	System.out.println("Do you want whatever is in this ENVELOPE! or " + pContainers[randN]);
	System.out.print("What ever you don't get then we will give to our second player, And your name is:");
	player2 = new Player(input.nextLine());
	System.out.print("So, " + player1.getName() + "what do you want. Just remember either one of them could be a ZONK! So chose wisely: ");
	
	
	}
	
	
	//methods
	
	
}
