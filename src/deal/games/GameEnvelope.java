package deal.games;

/*******************
 * Team: DragonArmy26
 * Author: Hyrum Smith
 * 
 * 
 ******************/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import deal.data.Player;
import deal.data.Prize;

public class GameEnvelope extends LetsMakeADealGame {
	// fields
	private Scanner input = new Scanner(System.in);
	private Random rand = new Random();

	Player envelopePlayer;
	Player notEnPlayer;
	
	// prizes
	ArrayList<Prize> prizes;

	// Game Objects
	String[] oContainers = { "Curtain1", "Curtain2", "Curtain3", "Door1",
			"Door2", "Door3", "Big box", "Box" };
	String[] oPrize = { "a Zonk", "a Ford Fiesta!!", "Ski Gear!!", "a Zonk", "a Camera!!",
			"a Kitchen!!", "a Zonk", "a Motor Scooter!!" };
	String[] pPrize = { "Zonk", "Check", "Cashs", "Winter Vacation", "Zonk",
			"Summer Vacation" };
	private String[] pContainers = { "Magazine", "Envelope" };
	

	// players
	ArrayList<Player> players = new ArrayList<>();

	// ctor
	public GameEnvelope() {
		// setup prizes
		prizes = new ArrayList<Prize>();
		prizes.add(prizePgenerator());
		prizes.add(prizeOgenerator());
		prizes.add(prizeOgenerator());
		prizes.add(prizeOgenerator());
		prizes.add(prizeOgenerator());
//		prizes.forEach(prize -> {
//			System.out.println("*****PRIZE: " + prize.getPrize() + " in a " + prize.getContainer());
//		});
	}
	

	// methods
	public void addPlayer() {
		System.out.print("What is your name: ");
		Player nPlayer = new Player(input.nextLine());
		players.add(nPlayer);
	}
	
	public Prize prizePgenerator(){
		// randomize container
		int cIndex = rand.nextInt(pContainers.length);
		String container = pContainers[cIndex];
		
		// randomize prize
		String prize = pPrize[rand.nextInt(pPrize.length)];
		
		Prize nPrize = new Prize(prize, container);
		return nPrize;
	}
	public Prize prizeOgenerator(){
		// randomize container
		int cIndex = rand.nextInt(oContainers.length);
		String container = oContainers[cIndex];
		
		// randomize prize
		String prize = oPrize[rand.nextInt(oPrize.length -1) + 1];
		
		Prize nPrize = new Prize(prize, container);
		return nPrize;
	}

	@Override
	public void runGame() {
		// setup player 1
		System.out.println("Who wants to make a Deal? ");
		addPlayer();
		Player player1 = players.get(0);
		
		// describe game rules
		Prize firstPrize = prizes.get(0);
		prizes.remove(firstPrize);
		Prize secondPrize = prizes.get(rand.nextInt(prizes.size()));
		prizes.remove(secondPrize);
		System.out.printf("Do you want whatever is in this %s or %s,\n", firstPrize.getContainer(), secondPrize.getContainer());
		System.out.print("What ever you don't get then we will give to our second player. \n\n");
		
		// setup player 2
		addPlayer();
		Player player2 = players.get(1);
		
		System.out.println("So what ever you don't choose we will give to, " + player2.getName() + ".\n");
		
		System.out.print("So, " + player1.getName() + ", what do you want?\n"
				+ "Just remember either one of them could be a ZONK!\n"
				+ "So chose wisely: ");

		// player one makes choice
		Prize choice1 = player1.returnChoice(player1, firstPrize, secondPrize);
		if(choice1 == firstPrize){
			envelopePlayer = player1;
			notEnPlayer = player2;
		}
		else if (choice1 == secondPrize){
			envelopePlayer = player2;
			notEnPlayer = player1;
		}
		
		//Shows the person without the envelope what they won!!
		System.out.printf("%nSo %s, you got %s!!!!!%n", notEnPlayer.getName(), secondPrize.getPrize());
		
		//Setup for the second choic of the game
		Prize thirdPrize = prizes.get(rand.nextInt(prizes.size()));
		prizes.remove(thirdPrize);
		System.out.printf("%nSo %s you have the %s, do you want %s or do you want what ever is inside %s%n", 
							envelopePlayer.getName(), firstPrize.getContainer(), firstPrize.getContainer(), thirdPrize.getContainer());
		System.out.print("Whatever you don't choose we will give to our third player.\n\n");
		
		//add third player
		addPlayer();
		Player player3 = players.get(2);
		System.out.printf("Again what ever you don't take we will give to %s%n", player3.getName());
		System.out.print("Either one of them could be a ZONK!! \nSo choose wisely: ");
	
		// The actual second choice
		Prize choice2 = envelopePlayer.returnChoice(envelopePlayer, firstPrize, thirdPrize);
		if(choice2 == firstPrize){
			notEnPlayer = player3;
		}
		else if(choice2 == thirdPrize){
			notEnPlayer = envelopePlayer;
			envelopePlayer = player3;
		}
		
		//offer Money instead of the prize???????????? how though
		
		//Shows the person without the envelope what they won!!
		System.out.printf("%n%s, you got.....   %s!!!!!%n%n", notEnPlayer.getName(), thirdPrize.getPrize());
		
		//Setup for the third choice of the game
		Prize fourthPrize = prizes.get(rand.nextInt(prizes.size()));
		prizes.remove(fourthPrize);
		System.out.printf("%s, you have %s. %nDo your want %s, or do you want whatever is inside %s: ",
							envelopePlayer.getName(), firstPrize.getContainer(), firstPrize.getContainer(), fourthPrize.getContainer());
		
		//last choice
		Prize lastChoice = envelopePlayer.returnChoice(envelopePlayer, firstPrize, fourthPrize);
		if(lastChoice == firstPrize){
			System.out.printf("%n%s you missed out on %s.%n%n%n", envelopePlayer.getName(), fourthPrize.getPrize());
			System.out.printf("But you got %s!!!!!", firstPrize.getPrize());
		}
		else if(lastChoice == fourthPrize){
			System.out.printf("%n%s you missed out on %s.%n%n%n", envelopePlayer.getName(), firstPrize.getPrize());
			System.out.printf("But you got %s!!!!!", fourthPrize.getPrize());
		}
		

	}

}
