import java.util.ArrayList;
import java.util.List;

/*******************
 * Team: DragonArmy26 Author:
 * 
 * 
 ******************/
public class MainClass {
	
	public static void main(String[] args) {
		
		List<TeamGame> listOfGames = new ArrayList<TeamGame>();
		listOfGames = makeGames(listOfGames, 20);
		
		// runs the game 20 times
		listOfGames.forEach(game -> {
			System.out.println("This is a new game");
		});
	}
	
	public static List<TeamGame> makeGames(List<TeamGame> gameList, int numberOfGames) {
		for(int i = 0; i < numberOfGames; i++ ) {
			TeamGame tg = new TeamGame();
			gameList.add(tg);
		}
		return gameList;
	}

}
