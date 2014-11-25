package deal;

import java.util.ArrayList;
import java.util.List;

import deal.games.GameEnvelope;
import deal.games.LetsMakeADealGame;
import deal.games.SpellingGame;
import deal.games.TeamGame;

/*******************
 * Team: DragonArmy26 Author:
 * 
 * 
 ******************/
public class MainClass {

	public static void main(String[] args) {

		List<LetsMakeADealGame> listOfGames = new ArrayList<LetsMakeADealGame>();
		listOfGames = makeTeamGames(listOfGames, 1);
		//listOfGames = makeSpellingGames(listOfGames, 1);
		//listOfGames = makeEnvelopeGames(listOfGames, 1);

		// runs the game 20 times
		listOfGames.forEach(game -> {
			System.out.println("This is a new game");
			if(game instanceof TeamGame) game.runGame();
			System.out.println("Game finished");
		});
	}

	public static List<LetsMakeADealGame> makeTeamGames(List<LetsMakeADealGame> gameList,
			int numberOfGames) {
		for (int i = 0; i < numberOfGames; i++) {
			TeamGame tg = new TeamGame();
			gameList.add(tg);
		}
		return gameList;
	}
	
	public static List<LetsMakeADealGame> makeSpellingGames(List<LetsMakeADealGame> gameList,
			int numberOfGames) {
		for (int i = 0; i < numberOfGames; i++) {
			SpellingGame sg = new SpellingGame();
			gameList.add(sg);
		}
		return gameList;
	}
	
	public static List<LetsMakeADealGame> makeEnvelopeGames(List<LetsMakeADealGame> gameList,
			int numberOfGames) {
		for (int i = 0; i < numberOfGames; i++) {
			GameEnvelope ge = new GameEnvelope();
			gameList.add(ge);
		}
		return gameList;
	}
}
